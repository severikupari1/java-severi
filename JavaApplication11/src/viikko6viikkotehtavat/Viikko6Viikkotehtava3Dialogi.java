/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6viikkotehtavat;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



class Viikko6Viikkotehtava3Dialogi extends JDialog implements ActionListener {

    private JTextField lampotila = new JTextField("");

    private JTextField kosteus = new JTextField("");
    
    private JTextField sademaara = new JTextField("");

    private JTextField tuulennopeus = new JTextField("");
    
    private JButton btnOk;
    boolean okPressed = true;

    public Viikko6Viikkotehtava3Dialogi(JFrame parent) {
        super(parent, "Mittausarvot", true);
        Container contentPane = getContentPane();
        JPanel p1 = new JPanel(new GridLayout(4, 2, 3, 3));
        p1.add(new JLabel("Lampotila:"));
        p1.add(lampotila);
        p1.add(new JLabel("Kosteus:"));
        p1.add(kosteus);
        p1.add(new JLabel("Tuulennopeus:"));
        p1.add(tuulennopeus);
        p1.add(new JLabel("Sademaara:"));
        p1.add(sademaara);
        contentPane.add("Center", p1);

        Panel p2 = new Panel();
        btnOk = addButton(p2, "Ok");
        contentPane.add("South", p2);
        setSize(400, 120);
    }

    private JButton addButton(Container c, String name) {
        JButton button = new JButton(name);
        button.addActionListener(this);
        c.add(button);
        return button;
    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == btnOk) {
            okPressed = true;
        }
        setVisible(false);
    }

    public boolean showDialog(Mittaus m) {
        lampotila.setText(Integer.toString(m.getLampotila()));
        sademaara.setText(Integer.toString(m.getSademaara()));
        tuulennopeus.setText(Integer.toString(m.getTuulennopeus()));
        kosteus.setText(Integer.toString(m.getKosteuspros()));
        okPressed = false;
        setVisible(true);
        if (okPressed) {
            m.setLampotila(Integer.parseInt(lampotila.getText()));
            m.setSademaara(Integer.parseInt(sademaara.getText()));
            m.setKosteuspros(Integer.parseInt(kosteus.getText()));
            m.setTuulennopeus(Integer.parseInt(tuulennopeus.getText()));
        }
        return okPressed;
    }
}
