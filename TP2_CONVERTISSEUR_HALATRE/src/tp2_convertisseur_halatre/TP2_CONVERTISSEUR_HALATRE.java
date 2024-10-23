/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur_halatre;

import java.util.Scanner;

/**
 *
 * @author ennio
 */
public class TP2_CONVERTISSEUR_HALATRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur premiernombre=new Convertisseur();

       

        double val1;

        int conv;

         Scanner sc = new Scanner(System.in);

         System.out.println("Saisir la conversion");

         System.out.println("1) De Celcius vers Kelvin");

         System.out.println("2) Kelvin Vers Celcius");

         System.out.println("3) Farenheit Vers Celcius");

         System.out.println("4) Celcius Vers Farenheit");

         System.out.println("5) Kelvin Vers Farenheit");

         System.out.println("6) De Farenheit vers Kelvin");

         conv = sc.nextInt();

         System.out.println("Saisir la valeur que vous souhaiter convertir");

         val1 = sc.nextDouble();

         if (conv==1) {

             System.out.println(""+val1+" degres celcius est egal a "+premiernombre.CelciusVersKelvin(val1)+" degres Kelvin");

         } else if (conv==2){

             

             System.out.println(""+val1+" degres Kelvin est egal a "+premiernombre.KelvinVersCelcius(val1)+" degres celcius");

         } else if (conv==3){

             

             System.out.println(""+val1+" degres Farenheit est egal a "+premiernombre.FarenheitVersCelcius(val1)+" degres celcius");

         } else if (conv==4){

             

             System.out.println(""+val1+" degres Celcius est egal a "+premiernombre.CelciusVersFarenheit(val1)+" degres Farenheit");

         } else if (conv==5){

             

             System.out.println(""+val1+" degres Kelvin est egal a "+premiernombre.KelvinVersFarenheit(val1)+" degres Farenheit");

         }

         else if (conv==6){

             

             System.out.println(""+val1+" degres Farenheit est egal a "+premiernombre.FarenheitVersKelvin(val1)+" degres Kelvin");

         }

         System.out.println(premiernombre);

         

 

    }
}
    

