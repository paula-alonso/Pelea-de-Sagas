/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author marie
 *
 */
import EDD.Nodo;
import Clases.Global;
import Clases.Saga;
import EDD.Cola;
import Interfaces.Home;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Admin extends Thread {

    private AI ai;
    private Saga saga1;
    private Saga saga2;
    private int cycle_counter;
    private JLabel[] cards;

    public Admin(AI ai) {
        this.ai = ai;
        this.saga1 = ai.getSaga1();
        this.saga2 = ai.getSaga2();
        this.cycle_counter = 0;
    }

    @Override
    public void run() {

        while (true) {

            try {

                checkEmpty(); 
                
                //Simular que esta seleccionando los personajes
                Home.status.setText("Selecting...");
                ImageIcon icon = new ImageIcon("src/Assets/cargando.gif");
                cards[0].setIcon(icon);
                cards[1].setIcon(icon);
                sleep(1500);
                
                //Personajes seleccionados se colocan en las tarjetas
                pickCharacter(saga1);
                pickCharacter(saga2);
                
                // Permitir que AI se ejecute
                Home.g.getS1().release();
                
                // Esperar a que AI termine
                Home.g.getS2().acquire();
                cycle_counter++;
                handleWinner();
                handleTie();
                handleCancelled();
                sleep(1500);
                updateQueues();
                if (cycle_counter == 2) {
                    cycle_counter = 0;
                    double chances = Math.random();
                    if (chances <= 0.8) {
                        int random = (int) (Math.random() * 20);
                        saga1.addCharacter(random);
                        random = (int) (Math.random() * 20);
                        saga2.addCharacter(random);

                    }
                }
                sleep(1300);

            } catch (InterruptedException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void updateQueues() {
        saga1.updateCharactersPriorities();
        saga2.updateCharactersPriorities();
        saga1.updateBackupQueue();
        saga2.updateBackupQueue();
    }

    public void pickCharacter(Saga saga) {

        if (!saga.getHighPriorityQueue().isEmpty()) {

            picker(saga.getHighPriorityQueue(), saga);

        } else if (!saga.getMediumPriorityQueue().isEmpty()) {

            picker(saga.getMediumPriorityQueue(), saga);

        } else {

            picker(saga.getLowPriorityQueue(), saga);
        }
        updateCards(saga);
    }

    public void updateCards(Saga saga) {
        int index = 0;
        if (saga.getName().equals(Global.startrekName)) {
            index = 1;
        }
        cards[index].setIcon(saga.getPickedCharacter().getImgRoute());
    }

    private void picker(Cola queue, Saga saga) {

        Character picked = (Character) queue.getFirst().getData();
        saga.setPickedCharacter(picked);
        queue.Desencolar();
        saga.updateAllTextAreas();
        saga.getTitle_lable().setText(picked.getName());
        saga.getStats().setText(picked.printStats());
        System.out.print("\nSe ha escogido a: " + picked.getName());

    }

    private void checkEmpty() {
        if (saga1.getHighPriorityQueue().isEmpty() && saga1.getMediumPriorityQueue().isEmpty() && saga1.getLowPriorityQueue().isEmpty()) {
            int random = (int) (Math.random() * 20);
            saga1.addCharacter(random);
        }
        if (saga2.getHighPriorityQueue().isEmpty() && saga2.getMediumPriorityQueue().isEmpty() && saga2.getLowPriorityQueue().isEmpty()) {
            int random = (int) (Math.random() * 20);
            saga2.addCharacter(random);
        }
    }

    public void handleTie() {
        if (ai.getStatus() == "Tie!") {
            saga1.getHighPriorityQueue().Encolar(saga1.getPickedCharacter());
            saga2.getHighPriorityQueue().Encolar(saga2.getPickedCharacter());
            saga1.updateAllTextAreas();
            saga2.updateAllTextAreas();
        }

    }

    public void handleCancelled() {
        if (ai.getStatus() == "Cancelled!") {
            saga1.getBackupQueue().Encolar(saga1.getPickedCharacter());
            saga2.getBackupQueue().Encolar(saga2.getPickedCharacter());
            saga1.updateAllTextAreas();
            saga2.updateAllTextAreas();
        }

    }

    public void handleWinner() {
        if (ai.getStatus() == "Winner!") {
            Character winner = ai.determineWinner(saga1.getPickedCharacter(), saga2.getPickedCharacter());
            Home.status.setText(winner.getName() + " is the " + ai.getStatus());
            Home.g.getWinnersQueue().Encolar(winner);
            Home.g.updateTextArea();
            ai.setWinner(winner);

        }
    }

    /**
     * Get the value of ai
     *
     * @return the value of ai
     */
    public AI getAi() {
        return ai;
    }

    /**
     * Set the value of ai
     *
     * @param ai new value of ai
     */
    public void setAi(AI ai) {
        this.ai = ai;
    }

    /**
     * Get the value of saga2
     *
     * @return the value of saga2
     */
    public Saga getSaga2() {
        return saga2;
    }

    /**
     * Set the value of saga2
     *
     * @param saga2 new value of saga2
     */
    public void setSaga2(Saga saga2) {
        this.saga2 = saga2;
    }

    /**
     * Get the value of saga1
     *
     * @return the value of saga1
     */
    public Saga getSaga1() {
        return saga1;
    }

    /**
     * Set the value of saga1
     *
     * @param saga1 new value of saga1
     */
    public void setSaga1(Saga saga1) {
        this.saga1 = saga1;
    }

    /**
     * @param cards the cards to set
     */
    public void setCards(JLabel[] cards) {
        this.cards = cards;
    }

}
