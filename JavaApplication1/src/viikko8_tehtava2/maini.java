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
public class maini {
    public static void main(String[] args) {
        //Täällä sit luodaan uusi itemi ja tallennetaan se databseen?? ja printtaillaan
        Textbook tektibookki = new Textbook(12, "author", "language", "comment", "title", true);
        CD cd1 = new CD("asd", 12, 22, "asdasd", "asdasd", "asdasd", true);
        
        
        Video video1 = new Video("director", 12, 23, "language", "comment", "title", true);
        
        
        Database db = new Database();
        
        db.addCD(cd1);
        db.addTextbook(tektibookki);
        db.addVideo(video1);
        
        db.list();
        
        
        
        
    
    }
}
