/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author enniohalatre
 */
public class Épée extends Arme {
    int finesse;

    public Épée(String nom ,int finesse, int niveau_attaque) {
        super(nom, niveau_attaque);
         if (finesse < 0) {
            this.finesse = 0;
        } else if (finesse > 100) {
            this.finesse = 100;
        } else {
            this.finesse = finesse;
        }
    }
}
