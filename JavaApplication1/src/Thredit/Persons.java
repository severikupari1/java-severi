/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thredit;

import java.util.ArrayList;

/**
 *
 * @author Severi
 */
public class Persons {
    private ArrayList<Person> ihmiset = new ArrayList<Person>();

    public Persons() {
    }
    
    public synchronized void LisaaIhminen(String nimi2,int ika2){
        ihmiset.add(new Person(nimi2, ika2));
        System.out.println(ihmiset);
    }

    public ArrayList<Person> getIhmiset() {
        return ihmiset;
    }

    public void setIhmiset(ArrayList<Person> ihmiset) {
        this.ihmiset = ihmiset;
    }

    @Override
    public String toString() {
        return "Persons{" + "ihmiset=" + ihmiset + '}';
    }
    
    
}
