/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6;

/**
 *
 * @author s704383
 */
public class Kissa extends Elain {

    private int elamat;

    public void AsetaElamat(int uusielama) {
        this.elamat = uusielama;
    }

    
    public void PoistaElama() {
        if (this.elamat >= 0) {
            elamat--;
        } else {
            System.out.println("Elämiä ei voi vähentää, ei voi olla -1 elämää");
        }
    }

    public void SelvitaElamat() {
        System.out.println(this.elamat);
    }

    @Override
    void Puhu() {
         //To change body of generated methods, choose Tools | Templates.
         System.out.println("Mau olen Kisssa");
    }

}
