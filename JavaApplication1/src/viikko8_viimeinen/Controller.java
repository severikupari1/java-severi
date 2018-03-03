/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko8_viimeinen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Severi
 */
public class Controller {
    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculationListener(new CalculateListener());
        
    }
    
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            int firsNumber, secondNumber = 0;
            
            try {
                firsNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                
                theModel.addTwoNumbers(firsNumber, secondNumber);
                
                theView.setCalcSolution(theModel.getCalculatioValue());
                
            } catch (NumberFormatException e) {
                theView.displayErrorMessage("Anna kaksi kokonaislukua");
            }
            
        }
        
    }
        
    
    
}
