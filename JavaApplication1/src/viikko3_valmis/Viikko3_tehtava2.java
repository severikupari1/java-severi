/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3_valmis;

import java.util.Scanner;

/**
 *
 * @author s704383
 */
public class Viikko3_tehtava2 {
    
    public static void main(String[] args) {
        
        Scanner lukija;
        lukija = new Scanner(System.in);
        int luku1,luku2,kysymys;

            System.out.println("Annappas luku 1");
                luku1 = lukija.nextInt();
            System.out.println("Annappas luku 2");
                luku2 = lukija.nextInt();
            
            
            System.out.println("Valitse 1 = Summa, 2=vähennys, 3=kerto, 4=jako");
           kysymys = lukija.nextInt();
           switch (kysymys) {
            case 1:
                
                System.out.printf("%d + %d = %d\n",luku1,luku2,luku1 + luku2);
                break;
            case 2:
                
                System.out.printf("%d - %d = %d\n",luku1,luku2,luku1 - luku2);
                break;
            case 3:
                
                System.out.printf("%d * %d = %d\n",luku1,luku2,luku1 * luku2);
                
                break;
            case 4:
                
                if (luku2 == 0) {
                    System.out.println("Nollalla jako!");
                }
                else{
                    System.out.printf("%d / %d = %d\n",luku1,luku2,luku1 / luku2);
                }
                
                break;
            default:
                System.out.println("ei löytynyt");;
        }
           
        
        
        
        
    }
    
}
