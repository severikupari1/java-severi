/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saikeettut;

import java.util.ArrayList;


public class Tekstit {

    private ArrayList<String> tekstit
            = new ArrayList<String>();
    

    public synchronized String lueTeksti() {
        while (tekstit.isEmpty()) {
            try {
            wait(); //Jos sanomia ei ole, odotetaan
            }catch (Exception ex) {}
        }
        String luettu = tekstit.remove(0);
        return luettu;
    }

    public synchronized void lisaateksti(String t) {
    
        tekstit.add(t);
        notifyAll(); //jos joku odottelee, niin kerrotaa siitä
    }
    public synchronized String lueViimeinen() {
        String luettu = null;
        if (tekstit.size() > 0)
            luettu = tekstit.get(tekstit.size()-1);
        return luettu;
    }
}

