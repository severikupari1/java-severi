/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3_valmis;

/**
 *
 * @author s704383
 */
import java.util.Scanner;


public class Viikko3_tehtava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int kysymys;
        double sade;
        double laskettuala;
        Scanner lukija;
        lukija = new Scanner(System.in);
        
  
        do {
            System.out.println("1- laske ympyrän pinta-ala 2-pallon tilavuus 3-lopeta");
            kysymys = lukija.nextInt();
            
            switch (kysymys) {
        case 1:
            System.out.println("Annappas ympyrän säde");
            sade = lukija.nextDouble();
            laskettuala = Math.PI * Math.pow(sade, 2) ;
            
            //System.out.println("Laskettu " + laskettuala);
            System.out.printf("Laskettu ympyrän pinta-ala on %.2f \n", laskettuala);
            break;
            
              case 2:
            System.out.println("Annappas pallon säde");
            sade = lukija.nextDouble();
            laskettuala = (4 * Math.PI) * Math.pow(sade, 2) ;
            
            System.out.printf("Laskettu pallon pinta-ala on %.2f \n", laskettuala);
            
            break;
        
    }
            
        } while (kysymys != 3);
        
        
    }
    
}
