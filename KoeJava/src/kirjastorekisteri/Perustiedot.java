/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjastorekisteri;

/**
 *
 * @author Severi
 */
public abstract class Perustiedot {
    private String kieli,kommentti,otsikko;

    public Perustiedot(String kieli, String kommentti, String otsikko) {
        this.kieli = kieli;
        this.kommentti = kommentti;
        this.otsikko = otsikko;
    }

    public String getKieli() {
        return kieli;
    }

    public void setKieli(String kieli) {
        this.kieli = kieli;
    }

    public String getKommentti() {
        return kommentti;
    }

    public void setKommentti(String kommentti) {
        this.kommentti = kommentti;
    }

    public String getOtsikko() {
        return otsikko;
    }

    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }
    
    
    
}
