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
public class Textbook {
    private String author;
    private String language;
    private int numberPages;
    private boolean available;
    private String comment;
    private String title;

    public Textbook(String author, String language, int numberPages, boolean available, String comment, String title) {
        this.author = author;
        this.language = language;
        this.numberPages = numberPages;
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
        return "Textbook{" + "author=" + author + ", language=" + language + ", numberPages=" + numberPages + ", available=" + available + ", comment=" + comment + ", title=" + title + '}';
    }
    
    
    
    
    
    
    
}
