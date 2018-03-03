/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6viikkotehtavat;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author vtkinju
 */
public class Viikko6Viikkotehtavat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Viikko6Viikkotehtava1 lotto=new Viikko6Viikkotehtava1();
        lotto.setTitle("MyLotto");
        lotto.pack();
        lotto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lotto.setVisible(true);
        lotto.setSize(300, 150);
        */
        
        /*Viikko6Viikkotehtava2 ikkuna=new Viikko6Viikkotehtava2();
        ikkuna.setSize(400,500);
        ikkuna.setTitle("Nimitiedot");
        
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setVisible(true);*/
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                Mittaukset model = new Mittaukset();
                MyView view = new MyView("-"); 
                Viikko6Tehtava3Controller controller = new Viikko6Tehtava3Controller(model,view);
                controller.control();
            }
        });  

    }
    
}
