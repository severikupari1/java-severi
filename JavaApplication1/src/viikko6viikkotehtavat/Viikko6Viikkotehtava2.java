package viikko6viikkotehtavat;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Viikko6Viikkotehtava2 extends JFrame implements ActionListener {

    private JLabel etunimi;
    private JTextField txenimi;
    private JLabel sukunimi;
    private JTextField txsnimi;
    private JSlider slIka;
    private JRadioButton miesbtn;
    private JRadioButton nainenbtn;
    private JRadioButton muubtn;
    private JCheckBox tyotilanne;
    private JButton lisaa;
    private JTextArea teksti;
    private JLabel ika;
    private JLabel spuoli;
    private JLabel ttilanne;
    private JRadioButton naim;
    private JRadioButton eron;
    private JRadioButton naimaton;
    private JRadioButton leski;
    private JLabel siviili;
    private JLabel empty;
    
    ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();

    public Viikko6Viikkotehtava2() {

        etunimi = new JLabel("Etunimi:");
        txenimi = new JTextField();
        sukunimi = new JLabel("Sukunimi:");
        txsnimi = new JTextField();
        ika = new JLabel("Ikä:");

        slIka = new JSlider(JSlider.HORIZONTAL, 0, 120, 1);
        slIka.setMajorTickSpacing(20);
        slIka.setMinorTickSpacing(5);
        slIka.setPaintTicks(true);
        slIka.setPaintLabels(true);

        spuoli = new JLabel("Anna sukupuoli:");
        miesbtn = new JRadioButton("Mies");
        nainenbtn = new JRadioButton("Nainen");
        muubtn = new JRadioButton("Muu");

        siviili = new JLabel("Anna siviilisääty");
        empty = new JLabel();

        ButtonGroup group = new ButtonGroup();
        group.add(miesbtn);
        group.add(nainenbtn);
        group.add(muubtn);

        naim = new JRadioButton("Naimisissa");
        eron = new JRadioButton("Eronnut");
        naimaton = new JRadioButton("Naimaton");
        leski = new JRadioButton("Leski");

        ButtonGroup siviiligroup = new ButtonGroup();
        siviiligroup.add(naim);
        siviiligroup.add(eron);
        siviiligroup.add(naimaton);
        siviiligroup.add(leski);

        ttilanne = new JLabel("Töissä:");
        tyotilanne = new JCheckBox("Töissä");
        tyotilanne.setMnemonic(KeyEvent.VK_T);
        tyotilanne.setSelected(false);

        lisaa = new JButton("Lisää");
        lisaa.addActionListener(this);
        teksti = new JTextArea(10, 30);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));
        
        setLayout(new BorderLayout());

        p1.add(etunimi);
        p1.add(txenimi);

        p1.add(sukunimi);
        p1.add(txsnimi);


        add(ika);
        add(slIka);
        p1.add(ika);
        p1.add(slIka);
        add("North", p1);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(7, 2));
        p2.add(spuoli);
        p2.add(miesbtn);

        p2.add(nainenbtn);
        p2.add(muubtn);

        p2.add(siviili);
        p2.add(empty);

        p2.add(naim);
        p2.add(eron);

        p2.add(naimaton);
        p2.add(leski);

        p2.add(tyotilanne);
        add("Center",p2);
        
        add("East", lisaa);
        add("South", teksti);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton lisaa = (JButton) e.getSource();
        String etnimi = txenimi.getText();
        String sunimi = txsnimi.getText();
        int ikaa = slIka.getValue();

        String sukpuoli = "";
        if (miesbtn.isSelected() == true) {
            sukpuoli = miesbtn.getText();
        } else if (nainenbtn.isSelected() == true) {
            sukpuoli = nainenbtn.getText();
        } else if (muubtn.isSelected() == true) {
            sukpuoli = muubtn.getText();
        }
        String siviili = "";
        if (naim.isSelected() == true) {
            siviili = "Naimisissa";
        } else if (eron.isSelected() == true) {
            siviili = "Eronnut";
        } else if (naimaton.isSelected() == true) {
            siviili = "Naimaton";
        } else if (leski.isSelected() == true) {
            siviili = "Leski";
        }
        boolean tyo;
        if (tyotilanne.isSelected()) {
            tyo = true;
        } else {
            tyo = false;
        }
        Henkilo h = new Henkilo(etnimi, sunimi,
            ikaa, siviili, tyo , sukpuoli);
        henkilot.add(h);

        String lista = "";

        for (Henkilo  hh : henkilot) {
            lista += hh.toString() + "\n";
        }

        teksti.setText(lista);
    }

}
