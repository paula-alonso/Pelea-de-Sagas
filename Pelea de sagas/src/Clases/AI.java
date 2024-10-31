/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author marie
 *
 *
 */
import Clases.Character;
import Clases.Saga;
import Interfaces.Home;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AI extends Thread {

    private String status;
    private int counter;
    private boolean ready;
    private Saga saga1;
    private Saga saga2;
    private Character pickedCharacter1;
    private Character pickedCharacter2;
    private int waitingTime;
    private int speed;
    private Character winner;
    
    public AI(Saga saga1, Saga saga2) {
        this.counter = 0;
        this.ready = false;
        waitingTime = 5000;
        this.saga1 = saga1;
        this.saga2 = saga2;
        this.speed = 1;

    }
    
    @Override
    public void run() {

        while (true) {

            try {
                
                Home.g.getS1().acquire();
                status = "Deciding...";
                Home.status.setText(status);
                sleep(waitingTime);
                
                double chances = Math.random();
                if (chances <= 0.4) {
                    
                     status = "Winner!";
                     //Home.status.setText(status);
                    
                } else if (chances > 0.4 && chances <= 0.67) {
                    
                    status = "Tie!";
                    Home.status.setText(status);
                    
                } else {
                    
                    status = "Cancelled!";
                    Home.status.setText(status);
                    
                }
                Home.g.getS2().release();
             
            } catch (InterruptedException ex) {
                Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    boolean ready() {
        if (counter == 2) {
            ready = true;
            counter = 0;
        } else {
            ready = false;
        }
        return ready;
    }
    
    public Character determineWinner(Character character1, Character character2) {
        // Aplicar habilidades especiales
        //character1.aplicarHabilidades(character2);
        //character2.aplicarHabilidades(character1);

        // Calcular daño
        int daño1 = Math.max(0, character1.getStrengthPoints() - character2.getAgilityPoints());
        int daño2 = Math.max(0, character2.getStrengthPoints() - character1.getAgilityPoints());

        // Aplicar daño
        character1.setHealthPoints(character1.getHealthPoints() - daño2); 
        character2.setHealthPoints(character2.getHealthPoints() - daño1);

        // Determinar ganador
        if (character1.getHealthPoints() > character2.getHealthPoints()) {
            return character1;
        } else if (character2.getHealthPoints() > character1.getHealthPoints()) {
            return character2;
        } else {
            // Desempate basado en quién infligió más daño
            if (daño1 >= daño2) { //Cambiar despues
                return character1;
            } else if (daño2 > daño1) {
                return character2;
            } else {
                return null; // Empate
            }
        }

        
    
    }
    

    /**
     * Get the value of waitingTime
     *
     * @return the value of waitingTime
     */
    public int getWaitingTime() {
        return waitingTime;
    }

    /**
     * Set the value of waitingTime
     *
     * @param waitingTime new value of waitingTime
     */
    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }
    
    /**
     * Get the value of pickedCharacter2
     *
     * @return the value of pickedCharacter2
     */
    public Character getPickedCharacter2() {
        return pickedCharacter2;
    }

    /**
     * Set the value of pickedCharacter2
     *
     * @param pickedCharacter2 new value of pickedCharacter2
     */
    public void setPickedCharacter2(Character pickedCharacter2) {
        this.pickedCharacter2 = pickedCharacter2;
    }

    /**
     * Get the value of pickedCharacter1
     *
     * @return the value of pickedCharacter1
     */
    public Character getPickedCharacter1() {
        return pickedCharacter1;
    }

    /**
     * Set the value of pickedCharacter1
     *
     * @param pickedCharacter1 new value of pickedCharacter1
     */
    public void setPickedCharacter1(Character pickedCharacter1) {
        this.pickedCharacter1 = pickedCharacter1;
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
     * Get the value of ready
     *
     * @return the value of ready
     */
    public boolean isReady() {
        return ready;
    }

    /**
     * Set the value of ready
     *
     * @param ready new value of ready
     */
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    /**
     * Get the value of counter
     *
     * @return the value of counter
     */
    public int getCounter() {
        return counter;
    }

    /**
     * Set the value of counter
     *
     * @param counter new value of counter
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     * Get the value of status
     *
     * @return the value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the value of status
     *
     * @param status new value of status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the winner
     */
    public Character getWinner() {
        return winner;
    }

    /**
     * @param winner the winner to set
     */
    public void setWinner(Character winner) {
        this.winner = winner;
    }
}
