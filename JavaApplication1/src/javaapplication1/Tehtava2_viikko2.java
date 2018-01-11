/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

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
                   
            System.out.println(Arrays.stream(kuukausitulot).sum());
            System.out.println(Arrays.stream(kuukausitulot).max().getAsDouble());
        } catch (InputMismatchException e) {
            System.out.println("Virhe syötteiden lukemisessa");
            System.exit(0);
        }
    }
}
