/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjastorekisteri;

/**
 *
 * @author Severi
 */
public class main {
    public static void main(String[] args) {
        Cdt cd = new Cdt("asd", "kieli", "kommentti", "otsikko");
        

        lainaaja lainaus = new lainaaja("etunimi", "etunimi", "etunimi", "etunimi");
        
        lainaus.lisaaCd(cd);
         lainaus.lisaaCd(cd);
        lainaus.tulostaCdt();
        System.out.println(lainaus.toString());
    }
}
