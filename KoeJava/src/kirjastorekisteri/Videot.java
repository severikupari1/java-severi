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
public class Videot extends Perustiedot{
    

   
    private String ohjaaja;
    private double pituus;

    public Videot(String ohjaaja, double pituus, String kieli, String kommentti, String otsikko) {
        super(kieli, kommentti, otsikko);
        this.ohjaaja = ohjaaja;
        this.pituus = pituus;
    }

    

    @Override
    public String toString() {
        return "Videot{" + "ohjaaja=" + ohjaaja + ", pituus=" + pituus + '}';
    }
   

    
}


