/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thredit;

import java.util.Scanner;

/**
 *
 * @author Severi
 */
public class LueTiedotThread extends Thread{
    
    Scanner lukija = new Scanner(System.in);
    Persons ihmiset1;
    private int interval;

    public LueTiedotThread(Persons ihmiset1, int interval) {
        this.ihmiset1 = ihmiset1;
        this.interval = interval;
    }
    
    
    @Override
    public void run() {
     
        while (true) {            
            try {
                System.out.println("Annappas nimi / kirjoita loppu");
                String nimi = lukija.nextLine();
                
                if (nimi.equals("loppu")) {
                    break;
                }
                System.out.println("Annappas ikä");
                int ika = lukija.nextInt();
                lukija.nextLine();
                ihmiset1.LisaaIhminen(nimi, ika);
                
                Thread.sleep(interval);
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        
    
    }
        
}
