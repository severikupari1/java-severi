/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saikeet;

/**
 *
 * @author Severi
 */
public class Maini {
    public static void main(String[] args) {
        Ekathread th1 = new Ekathread();
        Thread t1 = new Thread(th1);
        
        Tokathread th2 = new Tokathread();
        Thread t2 = new Thread(th2);
        
        t1.start();
       // t2.start();
                
        
    }
}
