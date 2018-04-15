/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testailua;

import java.util.Random;

/**
 *
 * @author s704383
 */
public class Korttipakka {
    
    private Pelikortti[] kortit = new Pelikortti[52];
    
    public void alustaPakka(){
        for (int i = 0; i < 13; i++) {
            kortit[i] = new Pelikortti("hertta", i+2);
        }
        for (int i = 13; i < 26; i++) {
            kortit[i] = new Pelikortti("ruutu", i-11);
        }
        for (int i = 26; i < 39; i++) {
            kortit[i] = new Pelikortti("pata", i-24);
        }
         for (int i = 39; i < 52; i++) {
            kortit[i] = new Pelikortti("risti", i-37);
        }
                
    }
    
    
    public void sekoitaPakka(){
        Pelikortti apukortti;
        
        int apuindeksi1,apuindeksi2;
        
        Random generator = new Random();
        
        for (int i = 0; i <= 52; i++) {
            
            apuindeksi1 = generator.nextInt(52);
            apuindeksi2 = generator.nextInt(52);
            
            
            apukortti = kortit[apuindeksi1];
            kortit[apuindeksi1] = kortit[apuindeksi2];
            kortit[apuindeksi2] = apukortti;
                    
            
        }
    }//sekoita pakka loppu
    
    public Pelikortti paljastaPaallimmainenKortti(){
        return kortit[0];
    }
}
