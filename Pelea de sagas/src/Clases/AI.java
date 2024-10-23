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


public class AI {

    private String status;
    private int counter;
    private boolean ready;
    private Saga saga1;
    private Saga saga2;

    
    public AI() {
        this.counter = 0;
        this.ready = false;
        
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
     *
     */
    
   public void run(){
       counter ++;
       
    }
    boolean ready () {
        if (counter == 2) {
            ready = true;
            counter = 0;
        } else {
            ready = false;
        }
        return ready;
    }

    
}
