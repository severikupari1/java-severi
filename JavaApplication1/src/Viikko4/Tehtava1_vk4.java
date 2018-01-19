/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Laadi metodi (eli funktio), joka ottaa parametrinaan vuoden, kuukauden, p�iv�n ja tulostusformaatin.
 Metodi tulostaa p�iv�nm��r�n halutussa formaatissa. Alla on mahdolliset formaattivaihtoehdot:

6. joulukuuta 1917 (normaali formaatti)
6.12.1917 (lyhyt formaatti esimerkiksi taulukoihin)
1917-12-06 (kansainv�linen formaatti) 
 */
package Viikko4;

import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



/**
 *
 * @author Severi
 * 
 * YearMonth yearMonthObject = YearMonth.of(vuosiluku, i+1);
                daysInMonth = yearMonthObject.lengthOfMonth(); 
                System.out.printf("%s %d\n",kk[i],daysInMonth);
 * 
 */
public class Tehtava1_vk4 {
    
    public static void pvmTulostus(int v,int kk,int pv,int formaatti ){
        String[] kkstring = {"Tammikuu","Helmikuu","Maaliskuu","Huhtikuu","Toukokuu","Kesäkuu","Heinäkuu","Elokuu","Syyskuu","Lokakuu","Marraskuu","Joulukuu"};
        
        YearMonth aika = YearMonth.of(v, kk);
        
        switch (formaatti) {
            case 1:
                System.out.printf("%d. %s %d\n",pv,kkstring[kk],v);
                break;
            case 2:
                System.out.printf("%d.%d.%d\n",pv,kk,v);
                break;
            case 3:
                //System.out.printf("%d-%d-%d",v,kk,pv);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
                MonthDay source;
                source = MonthDay.of(kk, pv);
                
                DateTimeFormatter pvm = DateTimeFormatter.ofPattern("-dd", Locale.ENGLISH);
                
                System.out.println(formatter.format(aika) + source.format(pvm));
                
                break;
            default:
                System.out.println("Virhe formaatissa");
        }
 
    }
    
    
    
    public static void main(String[] args) {
      // pvmTulostus(int v,int kk,int pv,int formaatti )
        pvmTulostus(2018, 1, 6, 1);
        pvmTulostus(2018, 1, 6, 2);
        pvmTulostus(2018, 1, 6, 3);
    }
}
