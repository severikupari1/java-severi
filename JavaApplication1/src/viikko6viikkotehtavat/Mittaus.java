/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6viikkotehtavat;

/**
 *
 * @author s704383
 */
public class Mittaus {
    private int lampotila;
    private int kosteuspros;
    private int tuulennopeus;
    private int sademaara;

    public Mittaus(int lampotila, int kosteuspros, int tuulennopeus, int sademaara) {
        this.lampotila = lampotila;
        this.kosteuspros = kosteuspros;
        this.tuulennopeus = tuulennopeus;
        this.sademaara = sademaara;
    }

    public int getLampotila() {
        return lampotila;
    }

    public void setLampotila(int lampotila) {
        this.lampotila = lampotila;
    }

    public int getKosteuspros() {
        return kosteuspros;
    }

    public void setKosteuspros(int kosteuspros) {
        this.kosteuspros = kosteuspros;
    }

    public int getTuulennopeus() {
        return tuulennopeus;
    }

    public void setTuulennopeus(int tuulennopeus) {
        this.tuulennopeus = tuulennopeus;
    }

    public int getSademaara() {
        return sademaara;
    }

    public void setSademaara(int sademaara) {
        this.sademaara = sademaara;
    }

    @Override
    public String toString() {
        return "Mittaus{" + "lampotila=" + lampotila + ", kosteuspros=" + kosteuspros + ", tuulennopeus=" + tuulennopeus + ", sademaara=" + sademaara + '}';
    }
    
}
