/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thredit;

/**
 *
 * @author Severi
 */
public class Person {
    private String nimi;
    private int ika;

    public Person(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    @Override
    public String toString() {
        return "Person{" + "nimi=" + nimi + ", ika=" + ika + '}';
    }
    
    
}
