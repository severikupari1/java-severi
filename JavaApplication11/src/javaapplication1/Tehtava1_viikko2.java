/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.io.*;


/**
 *
 * @author s704383
 */
public class Tehtava1_viikko2 {
    
  public static void main(String args[]) {
    Tehtava1_viikko2 ini = new Tehtava1_viikko2();
    ini.doit();
    }
 
  public void doit() {
      int kieli;
      Scanner lukija;
      lukija = new Scanner(System.in);
      
      
    try{
      Properties p = new Properties();
      p.load(new FileInputStream("src/javaapplication1/viikonpaivat.properties")); 
      int i;
      
      //System.out.println("user = " + p.getProperty("DBuser"));
      
      
     // System.out.println(p.getProperty("1"));
      
      
      System.out.println("Milläs kielellä haluat tiedot? 1-suomi 2-enlanti 3-saksa");
      
      kieli = lukija.nextInt();
      
      switch(kieli){
          case 1:
              //suomi
              for(i = 1;i <= 7;i++)
              {                  
                  System.out.println(p.getProperty(Integer.toString(i)));
              }
              break;
          case 2:
              //enkku2
              for(i = 8;i <= 14;i++)
              {                  
                  System.out.println(p.getProperty(Integer.toString(i)));
              }
              break;
          case 3:
              //saksa
              for(i = 15;i <= 21;i++)
              {                  
                  System.out.println(p.getProperty(Integer.toString(i)));
              }
              break;    
           
      }
      
      //p.list(System.out);
      }
    catch (Exception e) {
      System.out.println(e);
      }
    }
}
