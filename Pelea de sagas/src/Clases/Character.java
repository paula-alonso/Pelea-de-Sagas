/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Math.random;
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
    private boolean health;
    private boolean strength;
    private boolean agility;
    private int priority;
    private int counter;
    private ImageIcon imgRoute;
    private String skillName;
    private int healthPoints;
    private int strengthPoints;
    private int agilityPoints;

    public Character(int id, String name) {
        this.id = id;
        this.name = name;
        this.skill = determineQuality(0.6); // 60% chance of being high quality
        this.health = determineQuality(0.7);
        this.strength = determineQuality(0.5);
        this.agility = determineQuality(0.4);
        this.priority = determinePriority();
        this.counter = 0;
        this.imgRoute = Global.getIcon(name);
        this.skillName = assignSkill(skill);
        this.healthPoints = assignPoints(health);
        this.strengthPoints = assignPoints(strength);
        this.agilityPoints = assignPoints(agility);
        
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
        if(health) qualityCount++;
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
    
    private int assignPoints(boolean stat) {
        
        int points;
        
        if (stat) {
            points = (int) (Math.random() * 50) + 1;
        } else {
            points = (int) (Math.random() * 50) + 51;
        }
        
        return points;
    }
    
    public String printStats() {
        String content = "skill: " + this.getSkillName() + "\nhealth: " + this.healthPoints + "\nstrength: " + this.strengthPoints + "\nagility: " + this.agilityPoints;
        return content;
    }
    
    private String assignSkill(boolean skill) {
        String skillAssigned = "None";
        
        if (skill) {
            int i = (int) (Math.random() * 3); 
            skillAssigned = Global.special_skills[i];
        }
        
        return skillAssigned;
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

    /**
     * @return the healthPoints
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * @return the strengthPoints
     */
    public int getStrengthPoints() {
        return strengthPoints;
    }

    /**
     * @return the agilityPoints
     */
    public int getAgilityPoints() {
        return agilityPoints;
    }

    /**
     * @param healthPoints the healthPoints to set
     */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    /**
     * @param strengthPoints the strengthPoints to set
     */
    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    /**
     * @param agilityPoints the agilityPoints to set
     */
    public void setAgilityPoints(int agilityPoints) {
        this.agilityPoints = agilityPoints;
    }

    /**
     * @return the skillName
     */
    public String getSkillName() {
        return skillName;
    }
    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    
}
