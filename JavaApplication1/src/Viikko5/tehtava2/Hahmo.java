/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 2. Laadi pelihahmo-luokka, joka sisältää ainakin seuraavat attribuutit:

Nimi, hahmoluokka (esim. soturi, varas, velho, ..), sukupuoli, ikä ja ase. Toteuta hahmoluokka ja ase omina luokkinaan ja käytä niitä pelihahmo-luokan attribuutteina.

Hahmoluokka sisältää ainakin seuraavat attribuutit:

Luokan nimi, hahmon taso ja erityistaidot.

Ase-luokka sisältää ainakin seuraavat attribuutit:

Tyyppi, vahinko ja bonukset.

Kaikissa toteutettavissa luokissa tulee olla metodit tietojen kyselemistä ja tulostamista varten. Attribuuttien tyypit voit valita parhaaksi katsomallasi tavalla.

Laadi lisäksi pääohjelma, jossa testaat luomiesi luokkien toiminnallisuuden.
 */
package Viikko5.tehtava2;

/**
 *
 * @author Severi
 */
public class Hahmo {
    public static void main(String[] args) {
        PeliHahmo ukko1;
        ukko1 = new PeliHahmo("testiukko", PeliHahmo.sukupuoli.mies, 5);
        System.out.println(ukko1.getIka());
    }
   
}
