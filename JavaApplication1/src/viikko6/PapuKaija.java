/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6;

/**
 *
 * @author s704383
 */
public class PapuKaija extends Elain{
    private String omistaja;

    public void PapuKaija(String omistaja) {
        this.omistaja = omistaja;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }
    
}
