/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viikko4;

/**
 *
 * @author s704383
 */
public class Tehtava2_vk4 {
      
    
    public enum Level {
    aari,
    hehtaari
     }
 
    public static void laskeAla(double leveys,double pituus,Level x){
          
        switch (x) {
            case aari:
                //aari
                 
                 System.out.printf("aareina %.2f\n", (leveys * pituus)/100 );
                break;
            case hehtaari:
                //hehtaari
                System.out.printf("hehtaareina %.2f\n", (leveys * pituus)/10000 );
                break;
            default:
                throw new AssertionError();
        }
        
    }
    public static void main(String[] args) {
       
        laskeAla( 10,10,Level.aari);
        laskeAla( 10,10,Level.hehtaari);
          
    }
}
