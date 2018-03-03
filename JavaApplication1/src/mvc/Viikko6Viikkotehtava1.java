/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6viikkotehtavat;

/**
 *
 * @author vtkinju
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;


public class Viikko6Viikkotehtava1 extends JFrame {

        private JLabel[] tekstit = new JLabel[7];
        private JTextField[] kentat = new JTextField[7];
        private JLabel ohje = new JLabel("Syötä tai arvo");
        private JButton arvo;
        
        
        public Viikko6Viikkotehtava1(){
            for (int i = 0; i < 7; i++) {
                String nro =(i+1)+"."; 
                tekstit[i] = new JLabel(nro);
                kentat[i] = new JTextField();;
            }
           
            arvo=new JButton("ARVO");
            
            setLayout(new BorderLayout());
            
            JPanel p1 = new JPanel();
            p1.setLayout(new GridLayout(2,7));

            for (int i = 0; i < 7; i ++) {
                p1.add(tekstit[i]);

            }
            for (int i = 0; i < 7; i ++) {

                p1.add(kentat[i]);
            }
            add("North", ohje);
          
            add("Center", p1);
            add("South", arvo);
        }
    }


