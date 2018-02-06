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
       private String language;
       private int playingTime;
       private boolean available;
       private String comment;
       private String title;

    public CD(String artist, String language, int playingTime, boolean available, String comment, String title) {
        this.artist = artist;
        this.language = language;
        this.playingTime = playingTime;
        this.available = available;
        this.comment = comment;
        this.title = title;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isAvailable() {
        return available;
    }

   
    public String print() {
        return "CD{" + "artist=" + artist + ", language=" + language + ", playingTime=" + playingTime + ", available=" + available + ", comment=" + comment + ", title=" + title + '}';
    }
     
    
       
}
