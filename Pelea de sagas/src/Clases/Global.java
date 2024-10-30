/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.ImageIcon;

/**
 *
 * @author alons
 */
public class Global {

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

    public static ImageIcon getIcon(String name) {
        String path = "src/Assets/";
        ImageIcon icon = new ImageIcon(path+name+".png");
        return icon;
    }
    
    public static String starwarsName = "star wars";
    public static String startrekName = "star trek";
}
