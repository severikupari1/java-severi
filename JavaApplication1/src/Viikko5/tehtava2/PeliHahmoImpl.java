/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viikko5.tehtava2;


public class PeliHahmoImpl  {

    public static void main(String[] args) {
        PeliHahmo ukko1 = new PeliHahmo("severi", PeliHahmo.sukupuoli.mies, 0);
        
        
        System.out.println(ukko1.ase1.getVahinko());
        ukko1.ase1.setVahinko(Ase.Vahinko.keskikova);
        System.out.println(ukko1.ase1.getVahinko());
    }
    
}
