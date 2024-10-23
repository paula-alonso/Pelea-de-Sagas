/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Cola;
import Interfaces.Home;
import static Interfaces.Home.id;

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
    
    
    public Saga(String name) {
        this.name = name;
        this.hightPriorityQueue = new Cola();
        this.mediumPriorityQueue = new Cola();
        this.lowPriorityQueue = new Cola();
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
        } else if (character.getPriority() == 2) {
            mediumPriorityQueue.Encolar(character);
        }else {
            lowPriorityQueue.Encolar(character);
        }
        Home.id++;
        
        System.out.println("ID: "+ character.getId() +" Nombre: "+character.getName()+" Prioridad: "+character.getPriority()+" Añadido");
        
    }
    
    
}
