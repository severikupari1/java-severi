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
public class Textbook extends Item{

    private int pages;
    private String author;
    
   
//tänne sit teksibookin tiedot yms 
    public Textbook(int pages, String author, String language, String comment, String title, boolean available) {
        super(language, comment, title, available);
        this.pages = pages;
        this.author = author;
    }  

    public void print(){
        System.out.printf("author %s \n pages %d\n", author,pages);
    }

}
    
