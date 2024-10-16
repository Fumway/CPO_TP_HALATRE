/*
 *Halatre Ennio
 *11/10/2024
 */
package tp2_bieres_halatre;

/**
 *
 * @author ennio
 */
public class TP2_Bieres_HALATRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    BouteilleBiere uneBiere = new BouteilleBiere("cuvée des trolls", 7.0 , "Dubuisson") ;
    uneBiere.ouverte = false;
    uneBiere.lireEtiquette();
    
    BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 7.0 , "Abbaye de Leffe");
    deuxBiere.lireEtiquette();
    
    BouteilleBiere troisBiere = new BouteilleBiere("heineken", 7.5, "Brasserie EPF");
    troisBiere.lireEtiquette();
    
    BouteilleBiere quatreBiere = new BouteilleBiere("Skoll", 3.5, "Terre des Vikings");
    quatreBiere.lireEtiquette();
    
    BouteilleBiere cinqBiere = new BouteilleBiere("1664", 5.0, "Belgique lieu des frites");
    cinqBiere.lireEtiquette();
    
    //test de la fonction decapsuler
    System.out.println(uneBiere.Decapsuler());
    
    //test de la fonction toString
    System.out.println(troisBiere);
    System.out.println(uneBiere);
    
    }  
}
