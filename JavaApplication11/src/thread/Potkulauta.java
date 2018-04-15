/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Severi
 */
public class Potkulauta extends Laite{
    private double maxnopeus;

    public Potkulauta(double maxnopeus, String tunnus, String hankintapaiva, String nimi) {
        super(tunnus, hankintapaiva, nimi);
        this.maxnopeus = maxnopeus;
    }

    public double getMaxnopeus() {
        return maxnopeus;
    }

    public void setMaxnopeus(double maxnopeus) {
        this.maxnopeus = maxnopeus;
    }
    
}
