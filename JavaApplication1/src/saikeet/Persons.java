/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saikeet;

import java.util.ArrayList;

/**
 *
 * @author s704383
 */
public class Persons {
   private ArrayList<Person> ihmiset = new ArrayList<>();
   private int index;
   private double muutos;

   public synchronized void LisaaIhminen(String nimi,int ika){
       if (ihmiset.isEmpty()) {
           index = 1;
       }
       else{
           index = ihmiset.size()+1;
       } 
       ihmiset.add(new Person(index, nimi, ika) );
       
   }
   
   public synchronized void MuutosKokoon(){
       while (true) {  
           muutos = ihmiset.hashCode();
           if (ihmiset.hashCode() != muutos) {
               System.out.println("Bingo, Nysse tuli");
           }
           
           
       }
   }
   
}
