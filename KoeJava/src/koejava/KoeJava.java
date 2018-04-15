/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koejava;

/**
 *
 * @author Severi
 */
public class KoeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asiakas asiakas = new Asiakas(0, 1000, 0, "asd", "se", 0, "posit");
        
        System.out.println(asiakas.getSaldo());
        asiakas.KasvataSaldo(20);
        System.out.println(asiakas.getSaldo());     
        System.out.println(asiakas.KasvataSaldo(10));
        System.out.println(asiakas.KasvataSaldo(100));
        
        yritysasiakas yt = new yritysasiakas(0, 1, 100, 0, "asd", "asd", 0, "asd");
        
        System.out.println(yt.LisaaSaldoaAlv(90));
        System.out.println(yt.getSaldo());
        //System.out.println(yt.KasvataSaldo());
 
    }
    
}


