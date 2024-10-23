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
    
    String Model;
    String Marque;
    int PuissanceCV;
    Personne ProprietaireVoiture = null;
    
    public Voiture(String Model, String Marque, int PuissanceCV) {
        this.Model = Model;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        
        }
    
    @Override
    public String toString() {
        return "Voiture{" + "Model=" + Model + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
        
    
}
