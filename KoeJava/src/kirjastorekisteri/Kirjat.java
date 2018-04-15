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
public class Kirjat extends Perustiedot{
    private int sivunumero;

    public Kirjat(int sivunumero, String kieli, String kommentti, String otsikko) {
        super(kieli, kommentti, otsikko);
        this.sivunumero = sivunumero;
    }

    @Override
    public String toString() {
        return "Kirjat{" + "sivunumero=" + sivunumero + '}';
    }
    

   

   
}
