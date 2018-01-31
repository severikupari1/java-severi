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
public class PaaOhjelma {
    public static void main(String[] args) {
        Textbox boxi = new Textbox("Testi boxi");
        Slider slidu = new Slider(10, 20, 6);
        String[] Valintoja = {"Bansku","päärynä","omppu"};
        Listbox lbox = new Listbox(Valintoja);
        
        Komponentti[] komponentit = {boxi,slidu,lbox};
        
        KayttoLiittyma k = new KayttoLiittyma(komponentit);
        
        k.tulostaTxt();
        k.tulostaArvoja();
        
    }
}
