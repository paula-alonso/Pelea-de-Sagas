/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Cola;
import Interfaces.Home;
import static Interfaces.Home.id;
import javax.swing.JTextArea;

/**
 *
 * @author alons
 */
public class Saga {
    private String name;
    private Cola<Character> hightPriorityQueue;
    private Cola<Character> mediumPriorityQueue;
    private Cola<Character> lowPriorityQueue;
    private String[] character_list;
    private JTextArea[] labels;

    /**
     * Get the value of labels
     *
     * @return the value of labels
     */
    public JTextArea[] getLabels() {
        return labels;
    }

    /**
     * Set the value of labels
     *
     * @param labels new value of labels
     */
    public void setLabels(JTextArea[] labels) {
        this.labels = labels;
    }

    
    
    public Saga(String name) {
        this.name = name;
        this.hightPriorityQueue = new Cola();
        this.mediumPriorityQueue = new Cola();
        this.lowPriorityQueue = new Cola();
    }

    public Cola<Character> getHightPriorityQueue() {
        return hightPriorityQueue;
    }

    public void setHightPriorityQueue(Cola<Character> hightPriorityQueue) {
        this.hightPriorityQueue = hightPriorityQueue;
    }

    public Cola<Character> getMediumPriorityQueue() {
        return mediumPriorityQueue;
    }

    public void setMediumPriorityQueue(Cola<Character> mediumPriorityQueue) {
        this.mediumPriorityQueue = mediumPriorityQueue;
    }

    public Cola<Character> getLowPriorityQueue() {
        return lowPriorityQueue;
    }

    public void setLowPriorityQueue(Cola<Character> lowPriorityQueue) {
        this.lowPriorityQueue = lowPriorityQueue;
    }

    /**
     * Get the value of character_list
     *
     * @return the value of character_list
     */
    public String[] getCharacter_list() {
        return character_list;
    }

    /**
     * Set the value of character_list
     *
     * @param character_list new value of character_list
     */
    public void setCharacter_list(String[] character_list) {
        this.character_list = character_list;
    }


    
    
    /**
     * 
     * @param character 
     * Add characters to the priority queues
     */
    public void addCharacter(int picked){
        
        Character character = new Character(Home.id, character_list[picked]);
        
        if(character.getPriority() == 1){
            hightPriorityQueue.Encolar(character);
            this.labels[0].setText(hightPriorityQueue.imprimir());
            
        } else if (character.getPriority() == 2) {
            mediumPriorityQueue.Encolar(character);
            this.labels[1].setText(mediumPriorityQueue.imprimir());
        }else {
            lowPriorityQueue.Encolar(character);
            this.labels[2].setText(lowPriorityQueue.imprimir());
        }
        Home.id++;
        
        System.out.println(" ID: "+ character.getId() +" Nombre: "+character.getName()+" Prioridad: "+character.getPriority()+" Añadido");
        
    }
    
    
}
