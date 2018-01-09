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
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int luku;
        Locale.setDefault(Locale.ENGLISH);
        System.out.println("HELLO WORLD!!");
        Scanner lukija;
        lukija = new Scanner(System.in);
        
       
       
       try {
        System.out.println("ANNAS LUKU");
        luku = lukija.nextInt();
        System.out.println("Annoit luvun " + luku);
        }
        catch (
        InputMismatchException e) {
             System.out.println("Virhe syötteiden lukemisessa.");
             System.exit(0);
        }
           

        
    }
    
}
