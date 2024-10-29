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
import Interfaces.Home;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Admin extends Thread {

    private AI ai;
    private Saga saga1;
    private Saga saga2;
    private JLabel[] cards;

    public Admin(AI ai) {
        this.ai = ai;
        this.saga1 = ai.getSaga1();
        this.saga2 = ai.getSaga2();
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

    @Override
    public void run() {

        while (true) {

            pickCharacter(saga1);
            pickCharacter(saga2);

            if (ai.ready()) {
                double chances = Math.random();
                if (chances <= 0.8) {

                    int random = (int) (Math.random() * 20);
                    saga1.addCharacter(random);
                    random = (int) (Math.random() * 20);
                    saga2.addCharacter(random);

                }
            }

            ai.run();
            updateQueues();
        }
    }

    public void updateQueues() {
        saga1.updateCharactersPriorities();
        saga2.updateCharactersPriorities();
    }

    public void pickCharacter(Saga saga) {
        Character picked = null;
        if (!saga.getHightPriorityQueue().isEmpty()) {

            picked = (Character) saga.getHightPriorityQueue().getFirst().getData();
            saga.setPickedCharacter(picked);

            saga.getHightPriorityQueue().Desencolar();
            saga.getTextAreas()[0].setText(saga.getHightPriorityQueue().imprimir());
            saga.getTitle_lable().setText(picked.getName());
            System.out.print("\nSe ha escogido a: " + picked.getName());

        } else if (!saga.getMediumPriorityQueue().isEmpty()) {

            picked = (Character) saga.getMediumPriorityQueue().getFirst().getData();
            saga.setPickedCharacter(picked);

            saga.getMediumPriorityQueue().Desencolar();
            saga.getTextAreas()[1].setText(saga.getMediumPriorityQueue().imprimir());
            saga.getTitle_lable().setText(picked.getName());
            System.out.print("\nSe ha escogido a: " + picked.getName());

        } else {

            picked = (Character) saga.getLowPriorityQueue().getFirst().getData();
            saga.setPickedCharacter(picked);

            saga.getLowPriorityQueue().Desencolar();
            saga.getTextAreas()[2].setText(saga.getLowPriorityQueue().imprimir());
            saga.getTitle_lable().setText(picked.getName());
            System.out.print("\nSe ha escogido a: " + picked.getName());
        }
        updateCards(saga, picked);
    }

    public void updateCards(Saga saga, Character picked) {
        int index = 0;
        if (saga.getName().equals(Global.startrekName)) {
            index = 1;
        }
        cards[index].setIcon(picked.getImgRoute());
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
     * @param cards the cards to set
     */
    public void setCards(JLabel[] cards) {
        this.cards = cards;
    }

}
