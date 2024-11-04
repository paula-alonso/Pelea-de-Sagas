/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Cola;
import Interfaces.Home;
import java.util.concurrent.Semaphore;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

/**
 *
 * @author alons
 */
public class Global {
    private Cola<Character> winnersQueue;
    private Semaphore s1 = new Semaphore(0); // semaforo de sincronizacion que se inicializa en 0
    private Semaphore s2 = new Semaphore(0); // semaforo de sincronizacion que se inicializa en 0
    private int winsStarWars;
    private int winsStarTrek;

    public Global() {
        this.winnersQueue = new Cola();
        this.winsStarWars = 0;
        this.winsStarTrek = 0;
    }
    
    public void addWinnerSW () {
        this.winsStarWars += 1;
        Home.winsSW.setText("" + this.winsStarWars);
    }
    
    public void addWinnerST () {
        this.winsStarTrek += 1;
        Home.winsST.setText("" + this.winsStarTrek);
    }
    

    public static String[] star_wars_characters_names = {
        "Emperador", "Mace Windu", "Grand Moff Tarkin", "Chewbacca", "Admiral Ackbar",
        "K-2SO", "C-3PO", "Darth Maul", "Obi-Wan Kenobi", "R2-D2",
        "Luke Skywalker", "Princesa Leia", "Yoda", "Darth Vader", "Han Solo",
        "Ahsoka Tano", "Boba Fett", "Qui-Gon Jinn", "Anakin Skywalker", "Conde Dooku"
    };
    public static String[] star_trek_characters_names = {
        "Spock","Garak","Kai Winn","Data","EMH",
        "James T. Kirk","Jean-Luc Picard","Phlox","Benjamin Sisko","Kira",
        "T'Pol","Weyoun","Tuvok","Seven of Nine","Geordi La Forge",
        "Q","Kira Nerys","Leonard-Bones-McCoy","Miles O'Brien","Odo"
    };
    
    public static String[] special_skills = {"Feel The Force", "Energy Shield", "Healing Ray", "Precision Shot", "Cloaking Technology", "Quick Engineering"};

    public static ImageIcon getIcon(String name) {
        String path = "src/Assets/";
        ImageIcon icon = new ImageIcon(path+name+".png");
        return icon;
    }
    
    public static String starwarsName = "star wars";
    public static String startrekName = "star trek";
    
    public void updateTextArea(){
        Home.winners.setText(getWinnersQueue().imprimir());
    }

    /**
     * @return the winnersQueue
     */
    public Cola<Character> getWinnersQueue() {
        return winnersQueue;
    }

    /**
     * @param winnersQueue the winnersQueue to set
     */
    public void setWinnersQueue(Cola<Character> winnersQueue) {
        this.winnersQueue = winnersQueue;
    }

    /**
     * @return the s1
     */
    public Semaphore getS1() {
        return s1;
    }

    /**
     * @return the s2
     */
    public Semaphore getS2() {
        return s2;
    }
    
}
