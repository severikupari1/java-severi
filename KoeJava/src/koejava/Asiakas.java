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
public class Asiakas extends Yhteyshenkilo{
    private int asiakasnumero;
    private double maksimisaldo;
    private double saldo;

    public boolean KasvataSaldo(double maara){
        if ((this.saldo + maara) > this.maksimisaldo) {
            return false;
        }
        else{
           this.saldo += maara;        
           return true;
        }
        
    }

    public Asiakas(int asiakasnumero, double maksimisaldo, double saldo, String etunimi, String sukunimi, int postinumero, String postitoimipaikka) {
        super(etunimi, sukunimi, postinumero, postitoimipaikka);
        this.asiakasnumero = asiakasnumero;
        this.maksimisaldo = maksimisaldo;
        this.saldo = saldo;
    }
    
    
   

    public int getAsiakasnumero() {
        return asiakasnumero;
    }

    public void setAsiakasnumero(int asiakasnumero) {
        this.asiakasnumero = asiakasnumero;
    }

    public double getMaksimisaldo() {
        return maksimisaldo;
    }

    public void setMaksimisaldo(double maksimisaldo) {
        this.maksimisaldo = maksimisaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
