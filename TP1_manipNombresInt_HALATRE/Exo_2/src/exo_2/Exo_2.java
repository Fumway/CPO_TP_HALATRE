/*
 *  Halatre Ennio
 * 23/09/2024
 * TP1 exo2
 */
package exo_2;

import java.util.Scanner;

/**
 *
 * @author ennio
 */
public class Exo_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double value;
        int conversion;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value :");
        value=sc.nextDouble();
        System.out.println("""
                           Please enter the conversion:
                           1) Celcius toward Kelvin
                           2) Kelvin toward Celcuis
                           3) Farenheit toward Celcius
                           4) Celcius toward Farenheit
                           5) Kelvin toward Farenheit
                           6) Farenheit toward Kelvin""");
    conversion=sc.nextInt();  
   if (conversion == 1) {
            System.out.println(value+"degré celcius est égale à"+CelciusVersKelvin(value)+"degrés kelvin");
        } 
   if (conversion == 2) {
            System.out.println(value+"degré Kelvin est égale à"+KelvinVersCelcius(value)+"degrés Celcius");
        }
   if (conversion == 3) {
            System.out.println(value+"degré Farenheit est égale à"+FarenheitVersCelcius(value)+"degrés Celcius");
        }    
   if (conversion == 4) {
            System.out.println(value+"degré celcius est égale à"+CelciusVersFarenheit(value)+"degrés Farenheit");
        }
   if (conversion == 5) {
            System.out.println(value+"degré Kelvin est égale à"+KelvinVersFarenheit(value)+"degrés Farenheit");
        }
   if (conversion == 6) {
            System.out.println(value+"degré Farenheit est égale à"+FarenheitVersKelvin(value)+"degrés Kelvin");
        }
    }
    
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

 
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    
    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * (5.0 / 9.0);  
    }

    
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * (9.0 / 5.0)) + 32;  
    }

 
    public static double KelvinVersFarenheit(double tKelvin) {
        return (tKelvin - 273.15) * 1.8 + 32;
    }


    public static double FarenheitVersKelvin(double tFarenheit) {
        return (tFarenheit - 32) * (5.0 / 9.0) + 273.15;
    }
}