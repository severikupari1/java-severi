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
public class lainaaja extends Lainaukset{
    private String etunimi;
    private String sukunimi;

    public lainaaja(String etunimi, String sukunimi, String lainauspvm, String palautuspvm, ArrayList kirjat, ArrayList cdt, ArrayList videot) {
        super(lainauspvm, palautuspvm, kirjat, cdt, videot);
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }

   
}
