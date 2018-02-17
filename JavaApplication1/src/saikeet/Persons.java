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
   private int muutos;

    public ArrayList<Person> getIhmiset() {
        return ihmiset;
    }

    public void setIhmiset(ArrayList<Person> ihmiset) {
        this.ihmiset = ihmiset;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getMuutos() {
        return muutos;
    }

    public void setMuutos(int muutos) {
        this.muutos = muutos;
    }

    public Persons(int index, int muutos) {
        this.index = index;
        this.muutos = muutos;
    }

   public synchronized void LisaaIhminen(String nimi,int ika){
       if (ihmiset.isEmpty()) {
           index = 1;
       }
       else{
           index = ihmiset.size()+1;
       } 
       muutos = ihmiset.hashCode();
       ihmiset.add(new Person(index, nimi, ika) );
       //notifyAll();
   }
   
   public synchronized void MuutosKokoon(){
       while (true) {  
           
           if (muutos != ihmiset.hashCode()) {
               System.out.println("Ny se tuli");
           }
           
       }
   }
   
}
