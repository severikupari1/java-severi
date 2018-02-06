/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko8_tehtava2;



/**
 *
 * - playingTime: Integer
 * @author s704383
 */
public abstract class Playable extends Item{

//tähän mitä molemmilla cdllä ja videolla on! 
    
    private int playingTime;;

    public Playable(int playingTime, String language, String comment, String title, boolean available) {
        super(language, comment, title, available);
        this.playingTime = playingTime;
    }

   
    
    
    
    
    
    
}
