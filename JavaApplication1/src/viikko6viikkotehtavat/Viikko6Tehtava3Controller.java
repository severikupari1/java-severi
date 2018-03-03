/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6viikkotehtavat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author s704383
 */
public class Viikko6Tehtava3Controller {

    private Mittaukset model;
    private MyView view;
    private ActionListener actionListener;

    public Viikko6Tehtava3Controller(Mittaukset model, MyView view) {
        this.model = model;
        this.view = view;

    }

    public void control() {
        actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                linkValueUpdates();
            }
        };
        view.getButton().addActionListener(actionListener);
    }

    private void linkValueUpdates() {

        Mittaus m = new Mittaus(0, 0, 0, 0);
        Viikko6Viikkotehtava3Dialogi dialog = new Viikko6Viikkotehtava3Dialogi(view.getFrame());

        if (dialog.showDialog(m)) {
            model.add(m);
            Mittaus ka = model.mittasKa();
            view.setKeskiarvot(Integer.toString(ka.getLampotila()),
                    Integer.toString(ka.getKosteuspros()), 
                    Integer.toString(ka.getSademaara()), 
                    Integer.toString(ka.getTuulennopeus()));
 
        }
    }
}
