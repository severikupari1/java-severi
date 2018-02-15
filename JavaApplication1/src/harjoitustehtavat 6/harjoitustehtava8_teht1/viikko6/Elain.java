/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Toteuta sopivaksi katsomasi luokkahierarkia seuraavan kuvauksen pohjalta (hyödynnä periytymistä):

Eläimellä on nimi ja se voi olla elossa tai kuollut. Eläimelle voi antaa nimen
jonka käyttäjä voi myös selvittää/tulostaa. Käyttäjä voi myös selvittää, 
onko eläin elossa vai kuollut, sekä asettaa eläimen tilan kuolleeksi.

Kissa perii eläimen ominaisuudet. Lisäksi sillä on useita elämiä, 
jotka käyttäjä voi asettaa. Käyttäjä voi myös vähentää kissan elämiä, sekä selvittää niiden lukumäärän.

Myös papukaija perii eläimen ominaisuudet. Lisäksi sillä on merirosvoisäntä, 
jonka käyttäjä voi asettaa. Käyttäjä voi myös selvittää merirosvoisännän nimen.

Myös lammas perii eläimen ominaisuudet. Lisäksi se voi olla joko 
valkoinen tai musta lammas. Oletuksena lammas on valkoinen mutta käyttäjä voi 
muuttaa lampaan mustaksi ja takaisin valkoiseksi. Käyttäjä voi myös selvittää lampaan värin.

Laadi lisäksi pääohjelma, jossa testaat luomiesi luokkien toiminnallisuuden
 */
package viikko6;

/**
 *
 * @author s704383
 */
public abstract class Elain {
    private String nimi;
    private boolean elossa;

    
    public void TulostaNimi(){
        System.out.println(nimi);
    }
    
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public boolean isElossa() {
        return elossa;
    }

    public void setElossa(boolean elossa) {
        this.elossa = elossa;
    }
    
    abstract void Puhu();
    
}
