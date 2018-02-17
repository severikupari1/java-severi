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
public class TulostaMuutosThredi extends Thread{
     Persons mb;
     private int intervalli;

    public TulostaMuutosThredi(Persons mb, int intervalli) {
        this.mb = mb;
        this.intervalli = intervalli;
    }
     
    @Override
    public void run() {
        //super.run(); //To change body of generated methods, choose Tools | Templates.
        while (true) {            
            mb.PituudenMuutos();
           
        }
    }
    
    
}
