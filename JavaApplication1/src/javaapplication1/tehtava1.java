/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.*;
import java.util.Locale;
import java.util.Scanner;
   // Asetetaan oletuskieli englanniksi, mikäli halutaan
// käyttää desimaalierottimena pistettä pilkun sijaan.
/**
 *
 * @author s704383
 * 
 */
public class tehtava1 {

    /**
     * @param args the command line arguments
     */
    
    // 1. Laadi ohjelma, joka kysyy käyttäjältä kuvitteellisen henkilön seuraavat tiedot: ikä, 
    //pituus metreinä, paino sekä tieto siitä, omistaako kyseinen henkilö ajokortin.
    //Valitse tarvittavien muuttujien tietotyypit siten, että ne vievät mahdollisimman vähän turhaa tilaa.
    //Kun olet kysynyt tiedot käyttäjältä, tulosta ne näytölle.
    
    
    
//Laadi ohjelma, joka kysyy käyttäjältä seitsemän viikonpäivän sademäärät, jotka se tulostaa näytölle. Käytä ohjelmassasi vakiota ja taulukkoa. 
    
    public static void main(String[] args) {
        // TODO code application logic here
        byte ika;
        float pituus;
        float paino;
        byte ajokorttimuuttuja;
        boolean ajokortti = false;
        
        Locale.setDefault(Locale.ENGLISH);
        Scanner lukija;
        lukija = new Scanner(System.in);

       try {
        System.out.println("Annappas ikäsi");
        ika = lukija.nextByte();
        System.out.println("Annappas Pituutesi metreinä");
        pituus = lukija.nextFloat();
        System.out.println("Annappas painosi");
        paino = lukija.nextFloat();       
        System.out.println("Omistatko ajokortin? 1- Kyllä, 2- Ei");
        ajokorttimuuttuja = lukija.nextByte();
        
           if (ajokorttimuuttuja == 1) 
           {
               ajokortti = true;
           }
           else if(ajokorttimuuttuja == 2){
               ajokortti = false;
           }
           
        System.out.println("Ikäsi on " + ika);
        System.out.println("Pituutesi on " + pituus);
        System.out.println("painosi on " + paino);
           if (ajokortti) {
               System.out.println("Omistat ajokortin");
           }
           else{
               System.out.println("Et omista ajokorttia");
           }        
        }
        catch (
        InputMismatchException e) {
             System.out.println("Virhe syötteiden lukemisessa.");
             System.exit(0);
        }             
    }
    
}
