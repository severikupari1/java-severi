/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3_valmis;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearMonthDV;
import java.time.YearMonth;
import java.util.Scanner;

/**
 *
 * @author Severi
 */
public class Viikko3_tehtava3 {
    public static void main(String[] args) {
        int vuosiluku = 0;
        int i;
        Scanner lukija;
        lukija = new Scanner(System.in);
        int daysInMonth ;
        String[] kk = {"Tammikuu","Helmikuu","Maaliskuu","Huhtikuu","Toukokuu","Kesäkuu","Heinäkuu","Elokuu","Syyskuu","Lokakuu","Marraskuu","Joulukuu"};
    
        while (vuosiluku != -1) {            
            System.out.println("Annappas vuosiluku! -1 lopettaa");
            vuosiluku = lukija.nextInt();
            
           // YearMonth month = YearMonth.of(vuosiluku, 1);
            if (vuosiluku != -1) {
                for ( i = 0; i < 12; i++) {
                YearMonth yearMonthObject = YearMonth.of(vuosiluku, i+1);
                daysInMonth = yearMonthObject.lengthOfMonth(); 
                System.out.printf("%s %d\n",kk[i],daysInMonth);
                }
            }
        }
    }
}
