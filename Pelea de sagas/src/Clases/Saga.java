/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Cola;

/**
 *
 * @author alons
 */
public class Saga {
    private String name;
    private Cola<Character> hightPriorityQueue;
    private Cola<Character> mediumPriorityQueue;
    private Cola<Character> lowPriorityQueue;

    public Saga(String name) {
        this.name = name;
        this.hightPriorityQueue = new Cola();
        this.mediumPriorityQueue = new Cola();
        this.lowPriorityQueue = new Cola();
    }
    
    /**
     * 
     * @param character 
     * Add characters to the priority queues
     */
    public void addCharacter(Character character){
        if(character.getPriority() == 1){
            hightPriorityQueue.Encolar(character);
        } else if (character.getPriority() == 2) {
            mediumPriorityQueue.Encolar(character);
        }else {
            lowPriorityQueue.Encolar(character);
        }
        System.out.println("Nombre: "+character.getName()+" Prioridad: "+character.getPriority()+" Añadido");
    }
    
    
}
