/*Halatre Ennio 
 * 23/09/2024
 * TP1 exo 1
 */
package exo_1;

import java.util.Scanner;

/**
 *
 * @author ennio
 */
public class Exo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entier1;
        int entier2;
        int addition;
        int soustraction;
        int produit; 
        int quotien;
        int reste;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the entier n°1 :");
        entier1=sc.nextInt();
        System.out.println("Please enter the entier n°2 :");
        entier2=sc.nextInt();
        produit = entier1 * entier2;
        addition = entier1 + entier2;
        soustraction = entier1 - entier2;
        quotien = entier1 / entier2;
        reste = entier1 % entier2;
        System.out.println("la somme est :"+addition+"\n"+"la soustraction est :"+soustraction+"\n"+"le produit est :"+produit+"\n"+"Le quotien est :"+quotien+"\n"+"le reste est :"+reste);                       
    }
    
}
