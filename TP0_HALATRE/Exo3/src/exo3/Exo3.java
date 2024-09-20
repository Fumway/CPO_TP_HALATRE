package exo3;


import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *package exo3;

import java.util.Scanner;

/**
 *
 * @author ennio
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int operateur;
        int operande1;
        int operande2; 
        int resultat; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Please enter the operator:
                           1) add
                           2) substract
                           3) multiply
                           4) divide
                           5) modulo""");
        
        operateur=sc.nextInt();
        while (operateur<1 || operateur>5) {
            System.out.println("Please enter the operateur :");
            operateur=sc.nextInt();
    }
        System.out.println("Please enter the operande1");
        operande1=sc.nextInt();
        System.out.println("Please enter the operande2");
        operande2=sc.nextInt();
        if (operateur == 1) {
            resultat = operande1 + operande2;
            System.out.println("The result is "+ resultat);
        }
        
        if (operateur == 2) {
            resultat = operande1 - operande2;
            System.out.println("The result is "+ resultat);
        }
        if (operateur == 3) {
            resultat = operande1 * operande2;
            System.out.println("The result is "+ resultat);
        }        
        if (operateur == 4) {
            resultat = operande1 / operande2;
            System.out.println("The result is "+ resultat);
        }
        if (operateur == 5) {
            resultat = operande1 % operande2;
            System.out.println("The result is "+ resultat);
        }
    }
    
}
