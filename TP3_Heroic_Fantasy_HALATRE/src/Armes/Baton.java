/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author enniohalatre
 */
public class Baton extends Arme {
    int Age;

    public Baton(String nom, int age, int niveau_attaque) {
        super(nom, niveau_attaque);
         if (Age < 0) {
            this.Age = 0;
        } else if (Age > 100) {
            this.Age = 100;
        } else {
            this.Age = Age;
        }
    }
}   

