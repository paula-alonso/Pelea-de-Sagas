/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author alons
 */
public class Character {
    private int id;
    private String name;
    private boolean skill;
    private boolean healthPoints;
    private boolean strength;
    private boolean agility;
    private int priority;
    private int counter;
    private ImageIcon imgRoute;

    public Character(int id, String name) {
        this.id = id;
        this.name = name;
        this.skill = determineQuality(0.6); // 60% chance of being high quality
        this.healthPoints = determineQuality(0.7);
        this.strength = determineQuality(0.5);
        this.agility = determineQuality(0.4);
        this.priority = determinePriority();
        this.counter = 0;
        this.imgRoute = Global.getIcon(name);
        
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

    
    private boolean determineQuality(double probability){
        Random random = new Random();
        return random.nextDouble() < probability;
    }
    
    private int determinePriority(){
        int qualityCount = 0;
        if(skill) qualityCount++;
        if(healthPoints) qualityCount++;
        if(strength) qualityCount++;
        if(agility) qualityCount++;
        
        //Assing priority based on quality count
        if(qualityCount == 4){
            return 1;
        } else if (qualityCount >=2){
            return 2;
        } else {
            return 3;
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the imgRoute
     */
    public ImageIcon getImgRoute() {
        return imgRoute;
    }
    
    
}
