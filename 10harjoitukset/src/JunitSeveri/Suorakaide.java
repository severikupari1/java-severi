/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JunitSeveri;

/**
 *
 * @author s704383
 */
public class Suorakaide {
    private int leveys;
    private int korkeus;

    public Suorakaide(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
    }

    public Suorakaide() {
    }
    
    public int getAla(){
        return leveys * korkeus;
    }
    
    public int getKehanPituus(){
        return 2 * leveys + 2 * korkeus;
    }

    public int getLeveys() {
        return leveys;
    }

    public void setLeveys(int leveys) {
        this.leveys = leveys;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public void setKorkeus(int korkeus) {
        this.korkeus = korkeus;
    }
}
