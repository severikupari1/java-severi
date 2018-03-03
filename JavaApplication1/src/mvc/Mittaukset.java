/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6viikkotehtavat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vtkinju
 */
public class Mittaukset {
    private List<Mittaus> mittaukset = new ArrayList<Mittaus>();
    public void add(Mittaus m) {
        mittaukset.add(m);   
    }
    
    public Mittaus mittasKa() {
        int lkm = 0;
        int lampotilasumma = 0;
        int sademaarasumma = 0;
        int tuulennopeussumma = 0;
        int kosteusprossenttisumma = 0;
        for (Mittaus m: mittaukset)
        {
            lkm++;
            lampotilasumma += m.getLampotila();
            sademaarasumma += m.getSademaara();
            tuulennopeussumma += m.getTuulennopeus();
            kosteusprossenttisumma += m.getKosteuspros();
        }
        Mittaus m = null;
        if (lkm>0)
            m = new Mittaus(lampotilasumma/lkm, sademaarasumma/lkm,
                tuulennopeussumma/lkm, kosteusprossenttisumma/lkm);
        else
            m = new Mittaus(0,0,0,0);
        return m;
    } 
    
}
