/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author s704383
 */
public abstract class SahkoLaite extends Laite{

   
    private double virrankulutus;
    private boolean paalla;

    public SahkoLaite(double virrankulutus, boolean paalla, String tunnus, String hankintapaiva, String nimi) {
        super(tunnus, hankintapaiva, nimi);
        this.virrankulutus = virrankulutus;
        this.paalla = paalla;
    }

    public double getVirrankulutus() {
        return virrankulutus;
    }

    public void setVirrankulutus(double virrankulutus) {
        this.virrankulutus = virrankulutus;
    }

    public boolean isPaalla() {
        return paalla;
    }

    public void setPaalla(boolean paalla) {
        this.paalla = paalla;
    }
    
    
    
}
