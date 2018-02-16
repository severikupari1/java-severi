/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://amksavonia-my.sharepoint.com/personal/jukka_kinnunen_savonia_fi/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fjukka%5Fkinnunen%5Fsavonia%5Ffi%2FDocuments%2FOhjelmointi3%2FMessage%2Ejava&parent=%2Fpersonal%2Fjukka%5Fkinnunen%5Fsavonia%5Ffi%2FDocuments%2FOhjelmointi3&slrid=fd014b9e%2Dc080%2D5000%2Dd2f9%2D11cf880c0a12
https://amksavonia-my.sharepoint.com/personal/jukka_kinnunen_savonia_fi/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fjukka%5Fkinnunen%5Fsavonia%5Ffi%2FDocuments%2FOhjelmointi3%2FMessages%2Ejava&parent=%2Fpersonal%2Fjukka%5Fkinnunen%5Fsavonia%5Ffi%2FDocuments%2FOhjelmointi3&slrid=fe014b9e%2Da018%2D5000%2Deba8%2Dc25b5bae9fd9
 */
package saikeet;

/**
 *
 * @author s704383
 */
public class Person {
    private int id;
    private String nimi;
    private int ika;

    public Person(int id, String nimi, int ika) {
        this.id = id;
        this.nimi = nimi;
        this.ika = ika;
    }
    public Person(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
    
    
}
