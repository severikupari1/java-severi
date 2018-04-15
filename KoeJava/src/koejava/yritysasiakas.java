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
public class yritysasiakas extends Asiakas{

    private int ytunnus;

    public yritysasiakas(int ytunnus, int asiakasnumero, double maksimisaldo, double saldo, String etunimi, String sukunimi, int postinumero, String postitoimipaikka) {
        super(asiakasnumero, maksimisaldo, saldo, etunimi, sukunimi, postinumero, postitoimipaikka);
        this.ytunnus = ytunnus;
    }

    public int getYtunnus() {
        return ytunnus;
    }

    public void setYtunnus(int ytunnus) {
        this.ytunnus = ytunnus;
    }
    
    public boolean LisaaSaldoaAlv(double maara){
        if ( ((this.getSaldo() + maara)*1.24) > this.getMaksimisaldo()) {
            return false;
        }
        else{
            
            this.setSaldo((this.getSaldo() + maara)*1.24);
           return true;
        }
    }
    
    
}
