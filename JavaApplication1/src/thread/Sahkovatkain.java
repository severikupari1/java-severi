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
public class Sahkovatkain extends SahkoLaite{

    public Sahkovatkain(double maxkierrosnopeus, double aanenvoimakkuus, double virrankulutus, boolean paalla, String tunnus, String hankintapaiva, String nimi) {
        super(virrankulutus, paalla, tunnus, hankintapaiva, nimi);
        this.maxkierrosnopeus = maxkierrosnopeus;
        this.aanenvoimakkuus = aanenvoimakkuus;
    }

    public double getMaxkierrosnopeus() {
        return maxkierrosnopeus;
    }

    public void setMaxkierrosnopeus(double maxkierrosnopeus) {
        this.maxkierrosnopeus = maxkierrosnopeus;
    }

    public double getAanenvoimakkuus() {
        return aanenvoimakkuus;
    }

    public void setAanenvoimakkuus(double aanenvoimakkuus) {
        this.aanenvoimakkuus = aanenvoimakkuus;
    }

    
    
    private double maxkierrosnopeus;
    private double aanenvoimakkuus;
    
}
