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
public class Listbox extends Komponentti{
    private String[] tekstit;

    public Listbox(String[] tekstit) {
        this.tekstit = tekstit;
    }

    

    public String[] getTekstit() {
        return tekstit;
    }

    public void setTekstit(String[] tekstit) {
        this.tekstit = tekstit;
    }
}
