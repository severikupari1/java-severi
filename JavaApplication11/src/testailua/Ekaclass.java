/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testailua;

/**
 *
 * @author s704383
 */




public class Ekaclass {
    
    /**
     *
     * @param args
     */
    public static void main(String [] args){
        Korttipakka Pakka = new Korttipakka();
        
        Pelikortti Kortti1, Kortti2;
        
        Pakka.alustaPakka();
        
        Pakka.sekoitaPakka();
        System.out.println("Ekalle pelaajalle kortti.");
        Kortti1 = Pakka.paljastaPaallimmainenKortti();
        System.out.println("Ensimmäisen pelaajan kortti on " + Kortti1.kerroMaa() + " " + Kortti1.kerroSilmaluku() + ".");

        Pakka.sekoitaPakka();
        System.out.println("tokalle pelaajalle kortti.");
        Kortti2 = Pakka.paljastaPaallimmainenKortti();
        System.out.println("toisen pelaajan kortti on " + Kortti2.kerroMaa() + " " + Kortti2.kerroSilmaluku() + ".");
       
        if (Kortti1.kerroSilmaluku() > Kortti2.kerroSilmaluku()) {
            System.out.println("Eka voitti");
        }
        else if (Kortti2.kerroSilmaluku() > Kortti1.kerroSilmaluku()) {
            System.out.println("toka voitti");
        }
        else{
            System.out.println("Tasapeli.");
        }
       
        
    }//mainin loppu
   
}
