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
public class Cdt extends Perustiedot{
    
    private String artisti;

    public Cdt(String artisti, String kieli, String kommentti, String otsikko) {
        super(kieli, kommentti, otsikko);
        this.artisti = artisti;
    }

    
    
}
