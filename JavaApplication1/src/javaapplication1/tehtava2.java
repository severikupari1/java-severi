/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author s704383
 */
public class tehtava2 {
    //Laadi ohjelma, joka kysyy käyttäjältä seitsemän viikonpäivän sademäärät, jotka se tulostaa näytölle. Käytä ohjelmassasi vakiota ja taulukkoa. 
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        Locale.setDefault(Locale.ENGLISH);
        Scanner lukija;
        lukija = new Scanner(System.in);
        int i;
        String[] viikonpaivat = {"maanantaina","tiistaina","Keskiviikkona","torstaina","perjantaina","lauantaina","sunnuntaina"}; 
        double[] sademaara = new double[10];
         
        
        
       try {
        
       
        for(i = 0; i < 7;i++){
            System.out.println("sademäärä " + viikonpaivat[i]);
            sademaara[i] = lukija.nextDouble();
        }
       
       for(i = 0; i < 7;i++){
           
            System.out.println("sademäärä " + viikonpaivat[i] + " oli " + sademaara[i]);    
        }
       }
        catch (InputMismatchException e) {
             System.out.println("Virhe syötteiden lukemisessa.");
             System.exit(0);
        }             
    }
}
