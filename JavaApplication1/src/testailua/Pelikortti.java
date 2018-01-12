/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testailua;

/**
 *
 * @author s704383
 */
public class Pelikortti {
    private String maa;
    private int silmaluku;
    
    
    Pelikortti(String ma,int si){
                maa = ma;
                silmaluku = si;
    }
    
    public String kerroMaa(){
        return maa;
    }
    public int kerroSilmaluku(){
        return silmaluku;
    }
    public void asetaMaa(String uusimaa){
        maa = uusimaa;
    }
    public void asteSilmaluku(int uusisilmaluku){
        silmaluku = uusisilmaluku;
    }
}
