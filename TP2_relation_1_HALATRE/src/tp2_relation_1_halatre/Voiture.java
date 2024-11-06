package tp2_relation_1_halatre;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ennio
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    Personne ProprietaireVoiture;
    public Voiture(String Modele,String Marque,int PuissanceCV){
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.proprietaire = null;
    }
    
    @Override

    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
    
    
}
