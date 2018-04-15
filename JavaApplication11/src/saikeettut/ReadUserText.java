/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saikeettut;

import java.io.File;
import java.util.Scanner;


public class ReadUserText extends Thread {


    private int interval;

    Tekstit ts;

    public ReadUserText(int interval, Tekstit ts) {

        this.interval = interval;
        this.ts = ts;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Scanner lukija = new Scanner (System.in);
                System.out.print("Anna teksti: ");
                String teksti = lukija.nextLine();

                ts.lisaateksti(teksti);
                if (teksti.equals("LOPPU"))
                    break;
                    
                Thread.sleep(interval);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }


        }
        System.out.println("Lukusäie päättyy");
    }
}
