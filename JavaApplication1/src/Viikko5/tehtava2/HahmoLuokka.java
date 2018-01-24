/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viikko5.tehtava2;

/**
 *
 * @author s704383
 * 2. Laadi pelihahmo-luokka, joka sisältää ainakin seuraavat attribuutit:

Nimi, hahmoluokka (esim. soturi, varas, velho, ..), sukupuoli, ikä ja ase. Toteuta hahmoluokka ja ase omina luokkinaan ja käytä niitä pelihahmo-luokan attribuutteina.

Hahmoluokka sisältää ainakin seuraavat attribuutit:

Luokan nimi, hahmon taso ja erityistaidot.

Ase-luokka sisältää ainakin seuraavat attribuutit:

Tyyppi, vahinko ja bonukset.

Kaikissa toteutettavissa luokissa tulee olla metodit tietojen kyselemistä ja tulostamista varten. Attribuuttien tyypit voit valita parhaaksi katsomallasi tavalla.

Laadi lisäksi pääohjelma, jossa testaat luomiesi luokkien toiminnallisuuden.
 */
public class HahmoLuokka {
    
    private String nimi;
    private hahmotyyppi hahmo;
    private hahmontaso taso;
    private erityistaidot taidot;

    public HahmoLuokka(String nimi, hahmotyyppi hahmo, hahmontaso taso, erityistaidot taidot) {
        this.nimi = nimi;
        this.hahmo = hahmo;
        this.taso = taso;
        this.taidot = taidot;
    }

  
    
    public enum hahmontaso{
       taso1,
       taso2,
       taso3,
       taso4,
       taso5
   } 
    
    
    
   public enum hahmotyyppi{
       soturi,
       varas,
       velho
   } 
   
   public enum erityistaidot{
       maxpower,
       thiefmax,
       firebolt
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
     * @return the hahmo
     */
    public hahmotyyppi getHahmo() {
        return hahmo;
    }

    /**
     * @param hahmo the hahmo to set
     */
    public void setHahmo(hahmotyyppi hahmo) {
        this.hahmo = hahmo;
    }

    /**
     * @return the taso
     */
    public hahmontaso getTaso() {
        return taso;
    }

    /**
     * @param taso the taso to set
     */
    public void setTaso(hahmontaso taso) {
        this.taso = taso;
    }

    /**
     * @return the taidot
     */
    public erityistaidot getTaidot() {
        return taidot;
    }

    /**
     * @param taidot the taidot to set
     */
    public void setTaidot(erityistaidot taidot) {
        this.taidot = taidot;
    }

    /**
     * @return the sukupuoli
     */
   
}
