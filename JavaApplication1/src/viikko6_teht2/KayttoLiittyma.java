/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6_teht2;

import java.lang.reflect.Field;

/**
 *
 * @author s704383
 * Toteuta luokka Käyttöliittymä, joka pitää sisällään komponentteja 
 * (oma abstract -tyyppinen Komponentti- luokka). Käyttöliittymän komponentit
 * ovat kaikki yhdessä taulukossa.

Komponenttiluokassa on ominaisuudet x ja y eli komponentin paikka näytöllä.

Komponenttiluokasta on taas periytytetty luokat Textbox, Listbox ja Slider

Textbox sisältää tiedon tekstistä (text), joka kenttään tulee

Listbox  sisältää tiedot tekstiriveistä (texts[], jotka listboxiin tulee

Slider (liukusäädin)sisältää tiedot min ja max-arvot (min, max)  sekä nykyisen valinnan (val)

Tee Käyttöliittymä -luokalle metodi, joka kutsuu kaikkien komponenttien getText()  metodia. Huomaa, että getText-metodi ei ole periytetty metodi, joten sitä ei ole Komponentti-luokassa.

Tuossa hieman apuja

   Method [] methods=c.getMethods();
   for(Method m : methods) {
    if(m.getName().equals("getText")) {
     Object o=(Object)komponentti;
     try {

        String teksti = metodi.invoke(o);
        System.out.println(teksti);


Tee Käyttöliittymä -luokalle metodi, joka tulostaa sen kaikkien 
* Slider -komponenttien arvot (min, max, val)

Laadi lisäksi pääohjelma, jossa testaat luomiesi luokkien toiminnallisuuden.


Tarkennusta:



Käyttöliittymä onsiis  oma luokkansa ja siitä ei periytetä mitään . 
* Komponentti on oma abstract luokkansa. Listbox, textbox ja slider periytyvät Komponentti -luokasta.

Käyttöliittymä sisältää komponenetteja, kyse ei siisole perinnästä.
* Kuten aiemmassa esimerkisssä Osasto sisältää Tyontekijoita.

--Jukka
* 
*  for (Field f : kentat){
                String nimi = f.getName();
                if (nimi.equals("text")){
                    System.out.println(((Textbox)k).getTeksti());
                }
            }
 */
public class KayttoLiittyma {
    private Komponentti[] komponentit;
    
    public KayttoLiittyma(Komponentti[] komponentit) {
        this.komponentit = komponentit;
    }

   public void tulostaTxt(){
        for (int i = 0; i < komponentit.length; i++){
            Komponentti k = komponentit[i];
            
            Class <?> objClass;
            objClass = k.getClass();
            Field[] kentat;
            kentat = objClass.getDeclaredFields();
            
           for(Field f : kentat){
               String nimi = f.getName();
               if (nimi.equals("text")) {
                   System.out.println(((Textbox)k).getTeksti());
               }
           }

        }
    }
   
   public void tulostaArvoja(){
       for (int i = 0; i < komponentit.length; i++) {
           Komponentti k = komponentit[i];
           if (k instanceof Slider) {
               System.out.println("min: " + ((Slider) k).getMin() + "\nmax: " +
                ((Slider) k).getMax() + "\nvalinta: " + ((Slider) k).getVal());
           }
       }
   }
   
   
   
}