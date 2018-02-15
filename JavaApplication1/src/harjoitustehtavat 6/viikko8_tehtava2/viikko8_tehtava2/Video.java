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
public class Video extends Playable{

    private String director;
    private int time;

    public Video(String director, int time, int playingTime, String language, String comment, String title, boolean available) {
        super(playingTime, language, comment, title, available);
        this.director = director;
        this.time = time;
    }
    
        public void print(){
        System.out.printf("director %s \n time %d\n", director,time);
    }
    
    
    
}
