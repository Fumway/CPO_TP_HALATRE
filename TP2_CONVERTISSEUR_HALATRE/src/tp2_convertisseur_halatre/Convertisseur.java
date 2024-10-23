package tp2_convertisseur_halatre;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ennio
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur () {

        nbConversions= 0 ;

    }

      public double CelciusVersKelvin (double tCelcius) {

        nbConversions+=1;

        tCelcius=tCelcius+273.15;

        return tCelcius;

    }

    public double KelvinVersCelcius (double tKelvin){

        nbConversions+=1;

        tKelvin=tKelvin-273.15;

        return tKelvin;    

    }

    public double FarenheitVersCelcius (double tFar){

        nbConversions+=1;

        tFar =(tFar-32)/1.8;

        return tFar;    

    }

    public double CelciusVersFarenheit (double tCelcius){

        nbConversions+=1;

        tCelcius =tCelcius*1.8+32;

        return tCelcius;

    }

    public double KelvinVersFarenheit (double tKelvin){

        nbConversions+=1;

        tKelvin=KelvinVersCelcius(tKelvin);

        tKelvin=CelciusVersFarenheit(tKelvin);

        return tKelvin;

    }

    public double FarenheitVersKelvin (double tFar){

        nbConversions+=1;

        tFar = FarenheitVersCelcius(tFar);

        tFar = CelciusVersKelvin(tFar);

        return tFar;

    }

    @Override

    public String toString (){

        return "nb de conversions"+ nbConversions;

       

    }

}