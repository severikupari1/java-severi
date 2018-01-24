/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viikko5.tehtava2;

/**
 *
 * @author s704383
 */
public class HahmoLuokka {
    
    private String nimi;
    private hahmotyyppi hahmo;
    private hahmontaso taso;
    private erityistaidot taidot;
    
    public enum hahmontaso{
       taso1,
       taso2,
       taso3,
       taso4,
       taso5
   } 
    
    
   public enum hahmotyyppi{
       soturi,
       varas,
       velho
   } 
   
   public enum erityistaidot{
       maxpower,
       thiefmax,
       firebolt
   }

    /**
     * @return the nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * @param nimi the nimi to set
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * @return the hahmo
     */
    public hahmotyyppi getHahmo() {
        return hahmo;
    }

    /**
     * @param hahmo the hahmo to set
     */
    public void setHahmo(hahmotyyppi hahmo) {
        this.hahmo = hahmo;
    }

    /**
     * @return the taso
     */
    public hahmontaso getTaso() {
        return taso;
    }

    /**
     * @param taso the taso to set
     */
    public void setTaso(hahmontaso taso) {
        this.taso = taso;
    }

    /**
     * @return the taidot
     */
    public erityistaidot getTaidot() {
        return taidot;
    }

    /**
     * @param taidot the taidot to set
     */
    public void setTaidot(erityistaidot taidot) {
        this.taidot = taidot;
    }
    
}
