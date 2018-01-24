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

Laadi lisäksi pääohjelma, jossa testaat luomasi luokan toiminnallisuuden.
Laadi pelihahmo-luokka, joka sisältää ainakin seuraavat attribuutit:
 */
package Viikko5;

/**
 *
 * @author s704383
 */



public class Teos {
    private String tekija;
    private String teoksennimi;
    private String genre;
    private String isbn;
    private int sivumaara;
    
    private tilamuutos tila;

    
    public enum tilamuutos{
        saatavilla, 
        lainassa, 
        hävinnyt;
    } 
    
    public void Tulosta(){
        System.out.printf("Tekijä %s \n teoksennimi %s \n genre %s \n isbn %s \n sivumaara %d\n", tekija ,teoksennimi,genre,isbn,sivumaara);
    }
        
    
    

    /**
     * @return the tekija
     */
    public String getTekija() {
        return tekija;
    }

    /**
     * @param tekija the tekija to set
     */
    public void setTekija(String tekija) {
        this.tekija = tekija;
    }

    /**
     * @return the teoksennimi
     */
    public String getTeoksennimi() {
        return teoksennimi;
    }

    /**
     * @param teoksennimi the teoksennimi to set
     */
    public void setTeoksennimi(String teoksennimi) {
        this.teoksennimi = teoksennimi;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the sivumaara
     */
    public int getSivumaara() {
        return sivumaara;
    }

    /**
     * @param sivumaara the sivumaara to set
     */
    public void setSivumaara(int sivumaara) {
        this.sivumaara = sivumaara;
    }

    /**
     * @return the tila
     */
    public tilamuutos getTila() {
        return tila;
    }

    /**
     * @param tila the tila to set
     */
    public void setTila(tilamuutos tila) {
        this.tila = tila;
    }
    
  
}
