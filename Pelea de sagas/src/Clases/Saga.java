/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Cola;
import EDD.Nodo;
import Interfaces.Home;
import static Interfaces.Home.id;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import Clases.Character;

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
    private JTextArea[] textAreas;
    private JLabel title_lable;
    private Cola[] queuesArray;
    private Character pickedCharacter;

    /**
     * Get the value of pickedCharacter
     *
     * @return the value of pickedCharacter
     */
    public Character getPickedCharacter() {
        return pickedCharacter;
    }

    /**
     * Set the value of pickedCharacter
     *
     * @param pickedCharacter new value of pickedCharacter
     */
    public void setPickedCharacter(Character pickedCharacter) {
        this.pickedCharacter = pickedCharacter;
    }

    
    
     public Saga(String name) {
        this.name = name;
        this.hightPriorityQueue = new Cola();
        this.mediumPriorityQueue = new Cola();
        this.lowPriorityQueue = new Cola();
        queuesArray = new Cola[3];
        queuesArray[0] = hightPriorityQueue;
        queuesArray[1] = mediumPriorityQueue;
        queuesArray[2] = lowPriorityQueue;
    }
     
    public void updateCharactersPriorities(){
        updateCounters();
        for (int i = 1; i<3; i++){
            Nodo aux = queuesArray[i].getFirst();
            while(aux != null) {
                Character character = (Character) aux.getData();
                if (character.getCounter() == 8){
                    //Prioridad 2 --> Prioridad 1
                    if (i == 1){ 
                        hightPriorityQueue.Encolar(character);
                        mediumPriorityQueue.delete(aux);     
                    } else { // Prioridad 3 ---> Prioridad 2
                        mediumPriorityQueue.Encolar(character);
                        lowPriorityQueue.delete(aux);
                    }
                    updateAllTextAreas();
                }
                aux = aux.getpNext();
            }
        }
    }
     
    public void updateCounters(){
        for (int i = 0; i<3; i++){
            Nodo aux = queuesArray[i].getFirst();
            while(aux != null) {
                Character character = (Character) aux.getData();
                if (character.getCounter() < 8){
                    character.setCounter(character.getCounter() + 1);
                    System.out.println("contado nuevo: " + character.getCounter() + " nombre " + character.getName() + " id " + character.getId());
                }
                aux = aux.getpNext();
            }
        }
    }
    
    public void updateAllTextAreas(){
        updateTextArea(0);
        updateTextArea(1);
        updateTextArea(2);
    }
    
    public void updateTextArea(int index){
        textAreas[index].setText(queuesArray[index].imprimir());
    }
    
     /**
     * 
     * @param character 
     * Add characters to the priority queues
     */
    public void addCharacter(int picked){
        
        Character character = new Character(Home.id, character_list[picked]);
        int priorityIndex = character.getPriority() -1;
        queuesArray[priorityIndex].Encolar(character);
        updateTextArea(priorityIndex);
        Home.id++;
        
        System.out.println(" ID: "+ character.getId() +" Nombre: "+character.getName()+" Prioridad: "+character.getPriority()+" Añadido");
        
    }

    /**
     * Get the value of title_lable
     *
     * @return the value of title_lable
     */
    public JLabel getTitle_lable() {
        return title_lable;
    }

    /**
     * Set the value of title_lable
     *
     * @param title_lable new value of title_lable
     */
    public void setTitle_lable(JLabel title_lable) {
        this.title_lable = title_lable;
    }


    /**
     * Get the value of textAreas
     *
     * @return the value of textAreas
     */
    public JTextArea[] getTextAreas() {
        return textAreas;
    }

    /**
     * Set the value of textAreas
     *
     * @param textAreas new value of textAreas
     */
    public void setTextAreas(JTextArea[] textAreas) {
        this.textAreas = textAreas;
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
    
    
}
