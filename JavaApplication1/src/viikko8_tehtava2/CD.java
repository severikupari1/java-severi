/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko8_tehtava2;

/**
 *
 * @author s704383
 */
public class CD extends Playable{
     private String artist;

    public CD(String artist, int playingTime, String language, String comment, String title, boolean available) {
        super(playingTime, language, comment, title, available);
        this.artist = artist;
    }

   
    
}
