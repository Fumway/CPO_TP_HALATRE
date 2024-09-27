/*
 * Halatre Ennio
 * 27/09/2024
 *Exercice n°3
 */

package exo_3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ennio
 */
public class Exo_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random generateurAleat = new Random();
        
        int nbalea = generateurAleat.nextInt(100);     // on genere un nb aléatoire 
        int number = -1;                                    // on initialise la variable number
        int compteur = 0;                                   //on initialise un compteur
        int difficultie;                                    //on initialise la difficulté
        int difference = 0;                                 //on initialise une difference 
        int attempt = 3;
        
        System.out.println("""
                           Please enter the difficultie:
                           1) easy
                           2) medium
                           3) Hard""");
        difficultie=sc.nextInt();  
            
        if (difficultie == 1) {                              //difficulté facile
            while (number!=nbalea) {
                System.out.println("Chosse a number between 0 and 100");
                number=sc.nextInt();
                difference=nbalea-number;
                if (difference>35){
                    System.out.println("tooooo litle");
                    compteur=compteur+1;
                } else if (difference<35){
                    System.out.println("toooooo big");
                    compteur=compteur+1;
                } else {
                    System.out.println("Win !");
                }
                compteur=compteur+1;
            }
            System.out.println("The number of attempt is : "+compteur);
                                              
        }   else if (difficultie == 2) {                  //difficulté normal
                while (number!=nbalea) {
                System.out.println("Chosse a number between 0 and 100");
                number=sc.nextInt();
                if (nbalea>number) {
                    System.out.println("To big");
                } else if (nbalea<number) {
                    System.out.println("To litle");
                } else { 
                    System.out.println("Win !");
                }
                compteur=compteur+1;
                }
                System.out.println("The number of attempt is " + compteur );
                
            } else if (difficultie == 3) {              //difficulté difficile
                while (number!=nbalea) {
                    System.out.println(attempt+" attempt left");
                    System.out.println("Chosse a number between 0 and 100");
                    number=sc.nextInt();
                    if (number>nbalea) {
                        System.out.println("to big");
                    } else if (number<nbalea) {
                        System.out.println("too litle");
                    } else {
                        System.out.println("You win congratulation !");
                    }
                    compteur = compteur+1;
                    attempt = attempt-1;
                    if (attempt==0) {
                        System.out.println("You lost :("+"\n"+"noob");
                        number=nbalea;
                }
            }    
        }
    }    
}