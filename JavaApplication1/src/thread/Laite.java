/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Date;




/**
 *
 * @author s704383
 */
public abstract class Laite implements ILaite{
    protected String tunnus;
    protected String hankintapaiva;
    protected String nimi;
    
    
    public Laite(String tunnus, String hankintapaiva, String nimi) {
        this.tunnus = tunnus;
        this.hankintapaiva = hankintapaiva;
        this.nimi = nimi;
    }
    
    
    
    

    public String getTunnus() {
        return tunnus;
    }

    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }

    public String getHankintapaiva() {
        return hankintapaiva;
    }

    public void setHankintapaiva(String hankintapaiva) {
        this.hankintapaiva = hankintapaiva;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public void Ika() {
       String aika = this.hankintapaiva;
    }
    
    
   
    
}
