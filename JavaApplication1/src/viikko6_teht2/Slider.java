/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6_teht2;

/**
 *
 * @author s704383
 */
public class Slider extends Komponentti{
     private int min;
    private int max;
    private int val;

    public Slider(int min, int max, int val) {
        this.min = min;
        this.max = max;
        this.val = val;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    
    
}
