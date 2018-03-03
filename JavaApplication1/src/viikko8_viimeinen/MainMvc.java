/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko8_viimeinen;

/**
 *
 * @author Severi
 */
public class MainMvc {
    public static void main(String[] args) {
        View theView = new View();
        
        Model themodel = new Model();
        
        Controller theController = new Controller(theView, themodel);
        theView.setVisible(true);
    }
}
