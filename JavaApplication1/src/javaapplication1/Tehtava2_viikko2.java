/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.lang.reflect.Array;
import java.util.Arrays; //array summa yms...
import java.util.InputMismatchException; //error handling
import java.util.Locale; //locaali asetukset
import java.util.Scanner; //lukija yms

/**
 *
 * @author s704383
 */



public class Tehtava2_viikko2 {
    public static void main(String args[]){
        
        
        
        Locale.setDefault(Locale.ENGLISH);
        Scanner lukija = new Scanner(System.in);   
        int i;
        double[] kuukausitulot = new double[13];       
        try {           
            for (i = 1; i < 13; i++) {
                System.out.println("Annappas " + i + " kuukauden tulo");
                kuukausitulot[i] = lukija.nextDouble();
            }       
            System.out.println("Kokonaistulot ovat " + Arrays.stream(kuukausitulot).sum()); //Tulostetaan lukujen summa
            System.out.println("Keskiarvoinen kuukausikohtainen tulo on " + Arrays.stream(kuukausitulot).average().getAsDouble());
            System.out.println("Suurin kuukausikohtainen tulo on " + Arrays.stream(kuukausitulot).max().getAsDouble()); //tulostetaan suurin arvo taulukosta
        } catch (InputMismatchException e) {
            System.out.println("Virhe syötteiden lukemisessa");
            System.exit(0);
        }
    }
}
