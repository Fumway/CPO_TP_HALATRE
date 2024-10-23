/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_halatre1;

/**
 *
 * @author ennio
 */
public class TP2_manip_HALATRE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        int change;
        change=assiette1.nbCalories;
        assiette1 = assiette2;
        assiette2.nbCalories=change;
        Tartiflette assiette3 = assiette2 ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        Moussaka[] moussakaTab = new Moussaka[10];
           for (int i = 0; i < moussakaTab.length; i++) {
            moussakaTab[i] = new Moussaka(100 + i * 10);  // Instanciation de chaque Moussaka avec un nombre de calories différent
        }

        // Affichage du nombre de calories pour chaque objet Moussaka dans le tableau
        for (int i = 0; i < moussakaTab.length; i++) {
            System.out.println("Moussaka " + i + " contient " + moussakaTab[i].nbCalories + " calories.");
       
        
        }
    }
}
