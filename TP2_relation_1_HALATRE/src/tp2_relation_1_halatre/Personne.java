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
    int nb_Voitures;
    Voiture[] liste_voitures;

    public Personne(String Nom, String Prenom){
        this.nom = Nom;
        this.prenom = Prenom;
        liste_voitures = new Voiture[3];
        nb_Voitures= 0;
    }

    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire == null){
            return false;
        }
        if (nb_Voitures > 2){
            return false;
        }else{
            if (nb_Voitures == 0){
               liste_voitures[0] =  voiture_a_ajouter;
            }
            if (nb_Voitures == 1){
               liste_voitures[1] =  voiture_a_ajouter;
            }
            if (nb_Voitures == 2){
               liste_voitures[2] =  voiture_a_ajouter;
            }
        }
    return true;
    }
    @Override

    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
}