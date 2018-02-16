/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Severi
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println(date.toString());
        
        ArrayList<Laite> lista = new ArrayList<>();
        
        Potkulauta lauta = new Potkulauta(12, "tunnus", "15-02-2018", "lauta-2");
        SahkoPatteri patteri = new SahkoPatteri(12, 22, true, "tunnus", "14-02-2018", "nimi");
        Sahkovatkain vatkain = new Sahkovatkain(22, 100, 12, true, "tunnus", "13-02-2018", "vatkain");
        
        lista.add(lauta);
        lista.add(patteri);
        lista.add(vatkain);
        
        lista.;
        
        
        
    }
}
