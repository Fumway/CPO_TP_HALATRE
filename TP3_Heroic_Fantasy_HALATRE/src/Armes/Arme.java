/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author enniohalatre
 */
public abstract class Arme {
    String nom;
    int niveau_attaque;
    
    public Arme (String nom, int niveau_attaque) {
    
    this.nom = nom;
    if (niveau_attaque <= 0) { 
        niveau_attaque = 0;
    } else if (niveau_attaque >= 100) { 
        niveau_attaque = 100; 
    }
    this.niveau_attaque = niveau_attaque;
//            
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveau_attaque=" + niveau_attaque + '}';
    }
}