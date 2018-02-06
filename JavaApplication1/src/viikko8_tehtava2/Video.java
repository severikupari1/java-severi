/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko8_tehtava2;

/**
 *
 * @author s704383
 * - director: String

- language: String

- playingTime: Integer

- available: Boolean

- comment: String

+ Video (title: String, director: String, language: String, time: Integer)

+ setComment (comment: String)

+ getAvailable(): Boolean

+ print()
 */
public class Video {
       private String director;
       private String language;
       private int playingTime;
       private boolean available;
       private String comment;
       private String title;

    public Video(String title, String director, String language, int playingTime, boolean available, String comment) {
        this.title = title;
        this.director = director;
        this.language = language;
        this.playingTime = playingTime;
        this.available = available;
        this.comment = comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isAvailable() {
        return available;
    }

    public String Print() {
        return "Video{" + "director=" + director + ", language=" + language + ", playingTime=" + playingTime + ", available=" + available + ", comment=" + comment + ", title=" + title + '}';
    }

    
    
    
       
       
       
       
}
