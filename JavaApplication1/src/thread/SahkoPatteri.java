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
public class SahkoPatteri extends SahkoLaite{
    private double lammitysalue;

    public SahkoPatteri(double lammitysalue, double virrankulutus, boolean paalla, String tunnus, String hankintapaiva, String nimi) {
        super(virrankulutus, paalla, tunnus, hankintapaiva, nimi);
        this.lammitysalue = lammitysalue;
    }

    public double getLammitysalue() {
        return lammitysalue;
    }

    public void setLammitysalue(double lammitysalue) {
        this.lammitysalue = lammitysalue;
    }
    
}
