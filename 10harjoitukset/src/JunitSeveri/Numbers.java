/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JunitSeveri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Elias
 */
public class Numbers {
    private int numberCount = 0;
    private double[] numbers;

    public Numbers() {
        this.numbers = new double[10];
    }
    
    public int insert(double d){
        //numberCount = numbers.length;
        numbers[numberCount] = d;
        numberCount++;
        if (numberCount <= 10)
            return numberCount;
        else
            return -1;
    }
    
    public void delete(int i){
        double tmp = 0.0;
        numbers[i] = 0.0;
        for(int x = i+1;i<this.getCount();x++){
            numbers[i] = numbers[x];
            i++;
        }
    }
    
    public int getCount(){
        for(int i = 0; i < numbers.length;i++)
        {
            if (numbers.equals(0.0)){
                numberCount++;
            }
        }
        return numberCount;
    }
    
    public double itemAt(int i){
        return numbers[i];
    }
    
    public double avg(){
        double summa = 0;
        for (double d : numbers){
            summa += d;
        }
        return summa / this.getCount();
    }
    
    public double sum(){
        double summa = 0;
        for (double d : numbers){
            summa += d;
        }
        return summa;
    }
}
