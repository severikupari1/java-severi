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
   private ArrayList<Person> ihmiset = new ArrayList<Person>();
   private int index = 0;
   public synchronized void LisaaIhminen(String nimi,int ika){
       
       ihmiset.add(new Person(index, nimi, ika) );
       index++;
   }
}
