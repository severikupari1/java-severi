/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
1. Toteuta Teos-luokka kirjastokäyttöön. Luokan tulee
sisältää ainakin seuraavat attribuutit:

Tekijä, teoksen nimi, genre, ISBN, sivumäärä ja tila. 
Tila-attribuutti kertoo, onko teos saatavilla, lainassa, hävinnyt tms.

Luokan tulee sisältää ainakin seuraavan toiminnallisuuden
mahdollistavat metodit:

Teoksen tila täytyy voida muuttaa ja tarkistaa tai tulostaa.
Teoksen tiedot täytyy voida syöttää käyttäjän toimesta.
Teoksen tiedot täytyy voida tulostaa käyttäjälle.
 */
package Viikko5;

/**
 *
 * @author s704383
 */
public class PaaOhjelma {
    
    
    public static void main(String[] args) {
        
        Teos kirja1 = new Teos();
        
        
        
        kirja1.setTila(Teos.tilamuutos.saatavilla);
        System.out.println(kirja1.getTila());
        kirja1.setTila(Teos.tilamuutos.lainassa);
        System.out.println(kirja1.getTila());
        kirja1.setTila(Teos.tilamuutos.hävinnyt);
        System.out.println(kirja1.getTila());
        
        kirja1.setGenre("tiedekirja");
        kirja1.setIsbn("asd1123123123");
        kirja1.setSivumaara(199);
        kirja1.setTekija("Severi Kupari");
        kirja1.setTeoksennimi("Javan testaus kirja");
        
        kirja1
        
    }

    public PaaOhjelma() {
    }
    
    
    
    
    
}
