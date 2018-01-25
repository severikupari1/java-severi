/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viikko5.tehtava2;

/**
 *
 * @author s704383
 * 
 *  * 2. Laadi pelihahmo-luokka, joka sisältää ainakin seuraavat attribuutit:

Nimi, hahmoluokka (esim. soturi, varas, velho, ..), sukupuoli, ikä ja ase. Toteuta hahmoluokka ja ase omina luokkinaan ja käytä niitä pelihahmo-luokan attribuutteina.

Hahmoluokka sisältää ainakin seuraavat attribuutit:

Luokan nimi, hahmon taso ja erityistaidot.

Ase-luokka sisältää ainakin seuraavat attribuutit:

Tyyppi, vahinko ja bonukset.

Kaikissa toteutettavissa luokissa tulee olla metodit tietojen kyselemistä ja tulostamista varten. Attribuuttien tyypit voit valita parhaaksi katsomallasi tavalla.

Laadi lisäksi pääohjelma, jossa testaat luomiesi luokkien toiminnallisuuden.
 */
public class PeliHahmo {
    
    
    private String nimi;
    private sukupuoli sukupuoli;
    private int ika;
    HahmoLuokka hahmo1;
    Ase ase1;
    public PeliHahmo(String nimi, sukupuoli sukupuoli, int ika) {
        this.ase1 = new Ase();
        this.hahmo1 = new HahmoLuokka();
        this.nimi = nimi;
        this.sukupuoli = sukupuoli;
        this.ika = ika;    
    }
    
    
            
    public enum sukupuoli{
        mies,
        nainen
    }

    /**
     * @return the nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * @param nimi the nimi to set
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * @return the sukupuoli
     */
    public sukupuoli getSukupuoli() {
        return sukupuoli;
    }

    /**
     * @param sukupuoli the sukupuoli to set
     */
    public void setSukupuoli(sukupuoli sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    /**
     * @return the ika
     */
    public int getIka() {
        return ika;
    }

    /**
     * @param ika the ika to set
     */
    public void setIka(int ika) {
        this.ika = ika;
    }
    
    
    
}
