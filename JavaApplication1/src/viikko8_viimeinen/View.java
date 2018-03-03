/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko8_viimeinen;

import javax.swing.*;
import java.awt.event.ActionListener;
/**
 *
 * @author Severi
 */
public class View extends JFrame{
    
    
    private JTextField firstNumber = new JTextField(10);
    
    private JLabel additioonLabel = new JLabel("+");
    
    private JTextField secondNumber = new JTextField(10);
    
    private JButton calculateButton = new JButton("Laske");
    
    private JTextField calcSolution = new JTextField(10);
    
    View(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        
        calcPanel.add(firstNumber);
        calcPanel.add(additioonLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        this.add(calcPanel);
    }
    
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    
    
    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }
    
    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }
    
    void addCalculationListener(ActionListener listenForCalButton){
        calculateButton.addActionListener(listenForCalButton);
    }
    
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
}
