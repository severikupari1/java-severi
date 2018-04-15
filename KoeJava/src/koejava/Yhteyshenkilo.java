/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koejava;

/**
 *
 * @author Severi
 */
public class Yhteyshenkilo {
    private String etunimi;
    private String sukunimi;
    private int postinumero;
    private String postitoimipaikka;

    public Yhteyshenkilo(String etunimi, String sukunimi, int postinumero, String postitoimipaikka) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.postinumero = postinumero;
        this.postitoimipaikka = postitoimipaikka;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getPostinumero() {
        return postinumero;
    }

    public void setPostinumero(int postinumero) {
        this.postinumero = postinumero;
    }

    public String getPostitoimipaikka() {
        return postitoimipaikka;
    }

    public void setPostitoimipaikka(String postitoimipaikka) {
        this.postitoimipaikka = postitoimipaikka;
    }
    
    
    
}
