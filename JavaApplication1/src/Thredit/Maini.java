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
public class Maini {
    public static void main(String[] args) {
        Persons ihmiset1 = new Persons();
        LueTiedotThread lueTh = new LueTiedotThread(ihmiset1, 5000);
        Thread th1 = new Thread(lueTh);
        th1.start();
        TulostaMuutosThredi tulostath = new TulostaMuutosThredi(ihmiset1, 2000);
        Thread th2 = new Thread(tulostath);
        th2.start();
        
    }
}
