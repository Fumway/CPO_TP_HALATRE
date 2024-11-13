/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_halatre;

import Armes.Baton;
import Armes.Épée;
import java.util.ArrayList;

/**
 *
 * @author enniohalatre
 */
public class TP3_Heroic_Fantasy_HALATRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Épée Excalibur = new Épée("Excalibur", 70, 50);
        Épée Durandal = new Épée("Durandal", 40, 70);
        
        
        Baton Chêne = new Baton("Chêne", 40, 50);
        Baton Charme = new Baton("Charme", 50, 60);
        
        ArrayList<Arme> TabArme = new ArrayList<Arme>(); //decalaration du tableau Épée
        TabArme.add(Excalibur);
        TabArme.add(Durandal);
        TabArme.add(Chêne);
        TabArme.add(Charme);
        System.out.println(TabArme);
        System.out.println(TabArme.size());
        
        for (int i = 0; i < TabArme.size(); i++) {
            System.out.println("TabArme " + (i + 1) + ": " + TabArme.get(i));
        }
    }
}
