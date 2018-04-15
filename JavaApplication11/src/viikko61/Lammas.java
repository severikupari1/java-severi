/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko61;

/**
 *
 * @author s704383
 */
public class Lammas extends Elain{
    private Vari vari;

    public Vari getVari() {
        return vari;
    }

    public void setVari(Vari vari) {
        this.vari = vari;
    }

    @Override
    void Puhu() {
        System.out.println("mooo oon lammas");
    }
    
    public enum Vari{
        valkoinen,    
        musta
    };

    /**
     *Luo lammas
     */
    public Lammas() {
        this.vari = Vari.valkoinen;     
    }

    
    
}
