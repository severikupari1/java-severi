/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JunitSeveri;

/**
 *
 * @author Elias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Suorakaide s = new Suorakaide(3, 5);
        System.out.println("Ala: " + s.getAla() + " neliömetriä.");
        System.out.println("Kehä: " + s.getKehanPituus() + " metriä.");
    }
    
}
