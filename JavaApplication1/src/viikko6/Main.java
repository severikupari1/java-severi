/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6;

/**
 *
 * @author s704383
 */
public class Main {

    public static void main(String[] args) {
        Kissa esim = new Kissa();

        //kissa Alku        
        esim.setNimi("Testi Karvinen");
        esim.SelvitaElamat();
        esim.AsetaElamat(12);
        esim.SelvitaElamat();
        esim.PoistaElama();
        esim.SelvitaElamat();
        //kissa Loppu

        //papu alku
        PapuKaija papu = new PapuKaija();
        papu.setNimi("ROSVO");
        papu.setOmistaja("Piraatti");
        System.out.println(papu.getOmistaja());
        //papu Loppu 

        //lammas Alku
        Lammas lammas1 = new Lammas();
        lammas1.setNimi("LAMMASHAN SE");
        lammas1.TulostaNimi();
        System.out.println(lammas1.getVari());
        lammas1.setVari(Lammas.Vari.musta);
        System.out.println(lammas1.getVari());

        //lammas loppu
    }
}
