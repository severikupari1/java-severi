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
public class Model {
    private int calculationValue;
    
    public void addTwoNumbers(int firstNumber, int secondNumber){
    
        calculationValue = firstNumber + secondNumber;
    }
    
    public int getCalculatioValue(){
        return calculationValue;
    }
        
}
