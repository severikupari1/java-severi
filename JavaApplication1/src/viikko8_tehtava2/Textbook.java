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
    
    
   
//tänne sit teksibookin tiedot yms 

    public Textbook(int pages, String language, String comment, String title, boolean available) {
        super(language, comment, title, available);
        this.pages = pages;
    }
    
    
    
}
