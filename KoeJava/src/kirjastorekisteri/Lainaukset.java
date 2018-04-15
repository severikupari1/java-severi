/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjastorekisteri;

import java.util.ArrayList;

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

    public Lainaukset(String lainauspvm, String palautuspvm, ArrayList kirjat, ArrayList cdt, ArrayList videot) {
        this.lainauspvm = lainauspvm;
        this.palautuspvm = palautuspvm;
        this.kirjat = new ArrayList();
        this.cdt = new ArrayList();
        this.videot = new ArrayList();
    }
    
    
    
}
