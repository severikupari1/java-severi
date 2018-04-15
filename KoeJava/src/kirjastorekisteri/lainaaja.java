/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjastorekisteri;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Severi
 */
public class lainaaja extends Lainaukset{
    private String etunimi;
    private String sukunimi;

    public lainaaja(String etunimi, String sukunimi, String lainauspvm, String palautuspvm) {
        super(lainauspvm, palautuspvm);
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }

    public void tulostaKirjat(){
        for (Iterator iterator = super.getKirjat().iterator(); iterator.hasNext();) {
            Kirjat kirja = (Kirjat)iterator.next();
            System.out.println(kirja.toString());
        }
    }
    
     public void tulostaCdt(){
        for (Iterator iterator = super.getCdt().iterator(); iterator.hasNext();) {
            Cdt cd = (Cdt)iterator.next();
            System.out.println(cd.toString());
        }
    }
     
     public void tulostaVideot(){
         for (Iterator iterator = super.getVideot().iterator(); iterator.hasNext();) {
             Videot video = (Videot)iterator.next();
             System.out.println(video.toString());
         }
     }
   
}
