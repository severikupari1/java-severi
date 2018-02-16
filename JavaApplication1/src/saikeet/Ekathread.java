/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saikeet;

import java.util.Scanner;

/**
 *
 * @author s704383
 */
public class Ekathread implements Runnable{

    Scanner lukija = new Scanner(System.in);
    Persons ihminen;
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        while (true) {            
            try {
                System.out.println("Annas ihmisen nimi ja sitten ikä");
                ihminen.LisaaIhminen(lukija.nextLine(), lukija.nextInt());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
    
    
    
}
