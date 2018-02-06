/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko8_tehtava2;

/**
 *
 * @author s704383


- language: String//lisätty



- available: Boolean

- comment: String//lisätty
 */
public abstract class Item {
    //tänne kaikki mitä jokaisella itemillä pitää olla
    
    private String  language,comment,title;
    private boolean available;

    public Item(String language, String comment, String title, boolean available) {
        this.language = language;
        this.comment = comment;
        this.title = title;
        this.available = available;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isAvailable() {
        return available;
    }
    
    
    
    

   
    
    
    
}
