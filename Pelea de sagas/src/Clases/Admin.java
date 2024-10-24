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

public class Admin extends Thread {

    private AI ai;
    private Saga saga1;
    private Saga saga2;

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

}
