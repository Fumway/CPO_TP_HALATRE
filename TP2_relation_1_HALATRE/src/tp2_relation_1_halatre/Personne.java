/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_halatre;

/**
 *
 * @author ennio
 */
public class Personne {
    
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures = new Voiture [3] ;
    int voiturePosseder = 0;
    
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom; 
    }
    
}
