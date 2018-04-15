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
public class Lainaukset{
    private String lainauspvm;
    private String palautuspvm;

      private ArrayList kirjat;

    private ArrayList cdt;

    private ArrayList videot;

    public Lainaukset(String lainauspvm, String palautuspvm) {
        this.lainauspvm = lainauspvm;
        this.palautuspvm = palautuspvm;
        this.kirjat = new ArrayList();
        this.cdt = new ArrayList();
        this.videot = new ArrayList();
    }

    public String getLainauspvm() {
        return lainauspvm;
    }

    public void setLainauspvm(String lainauspvm) {
        this.lainauspvm = lainauspvm;
    }

    public String getPalautuspvm() {
        return palautuspvm;
    }

    public void setPalautuspvm(String palautuspvm) {
        this.palautuspvm = palautuspvm;
    }

    public void lisaaCd(Cdt cd){
        cdt.add(cd);
    }
    
    public void lisaaVideo(Videot video){
        videot.add(video);
    }
    
    public void lisaaKirja(Kirjat kirja){
        kirjat.add(kirja);
    }

    public ArrayList getKirjat() {
        return kirjat;
    }

    public ArrayList getCdt() {
        return cdt;
    }

    public ArrayList getVideot() {
        return videot;
    }
    
    
    
        
    
}
