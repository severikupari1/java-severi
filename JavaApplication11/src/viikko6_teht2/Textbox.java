/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6_teht2;

/**
 *
 * @author s704383
 */
public class Textbox extends Komponentti{
    private String teksti;

    public Textbox(String teksti) {
        this.teksti = teksti;
    }
    
    public String getTeksti() {
        return teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }
    
}
