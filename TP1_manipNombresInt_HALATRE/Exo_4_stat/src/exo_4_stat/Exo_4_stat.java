/* Halatre Ennio
 * 27/09/2024
 * Stat
 */
package exo_4_stat;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ennio
 */
public class Exo_4_stat {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int m = 0;
        int [] tab = new int[6];     //initialisation du tableau
        
        tab[0] = 0;
        tab[1] = 0;
        tab[2] = 0;
        tab[3] = 0;
        tab[4] = 0;
        tab[5] = 0;
        
        System.out.println("Please pick a number : ");
        m=sc.nextInt();
        for (int i = 0; i < m; i++) {
            int nbalea = generateurAleat.nextInt(6);  // on génère un nombre aléatoire entre 0 et 5
            tab[nbalea] = tab[nbalea] + 1;                  // on incrémente la case correspondante
        }
            System.out.print("[");
            for (int j = 0; j < tab.length; j++) {
                double pourcentage = (tab[j] / (double)m) * 100; //formule du pourcentage
                System.out.printf("%.2f%%", pourcentage);  // Affiche le pourcentage avec 2 chiffres après la virgule
                if (j < tab.length - 1) {
                    System.out.print(" ; ");
                }
            }
            System.out.print("]");        
    }
}
