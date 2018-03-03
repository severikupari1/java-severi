/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6viikkotehtavat;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class MyView {

    private JFrame frame;
    private JLabel lbllampotilaka;
    private JLabel lbltuulennopeuska;
    private JLabel lblkosteuska;
    private JLabel lblsademaaraka;
    
    private JTextField tflampotilaka;
    private JTextField tftuulennopeuska;
    private JTextField tfkosteuska;
    private JTextField tfsademaaraka;
    private JButton button;


    public MyView(String text) {
        frame = new JFrame("MyView");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,4));
        
        lbllampotilaka = new JLabel("Lampotila ka");
        p1.add(lbllampotilaka);
        tflampotilaka = new JTextField("0");
        p1.add(tflampotilaka);
        
        lblkosteuska = new JLabel("Kosteus ka");
        p1.add(lblkosteuska);
        tfkosteuska = new JTextField("0");
        p1.add(tfkosteuska);

        lbltuulennopeuska = new JLabel("Tuulennopeus ka");
        p1.add(lbltuulennopeuska);
        tftuulennopeuska = new JTextField("0");
        p1.add(tftuulennopeuska);

        lblsademaaraka = new JLabel("Sademaara ka");
        p1.add(lblsademaaraka);
        tfsademaaraka = new JTextField("0");
        p1.add(tfsademaaraka);
                
        frame.getContentPane().add(p1, BorderLayout.NORTH);

        button = new JButton("Anna mittaus");
        frame.getContentPane().add(button, BorderLayout.SOUTH);
    }

    public JButton getButton() {
        return button;
    }

    public void setKeskiarvot(String text1, String text2,
            String text3, String text4)
    {
        tflampotilaka.setText(text1);
        tfsademaaraka.setText(text2);
        tfkosteuska.setText(text3);
        tftuulennopeuska.setText(text4);
    }
    
    public void setLampotilaka(String text) {
        tflampotilaka.setText(text);
    }
    public JFrame getFrame() {
        return frame;
    }

    
}
