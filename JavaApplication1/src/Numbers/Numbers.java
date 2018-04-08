/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers;





/**
 *
 * @author Severi
 */
public class Numbers {
    double[] numbers = new double[10];
    int numbercount = 0;
    
    
    int insert(double value){
        //numbercount = numbers.length;
        if (numbercount != 10) {
            numbers[numbercount] = value;
            ++numbercount;
            return numbercount;
        } else{
            return -1;
        }
    }

    public void delete(int index){
        numbers[index] = 0;
        //Arrays.sort(numbers);
        double[] temp = sortDescending(numbers);
        
        
        numbers = temp;
                
        
        
        
    }
    
    public int getCount(){
        return numbercount;
    }
    
    public int find( double value) {
        int i = 0;
     while(i < numbers.length){
         if (numbers[i] == value) {
             return i;
         }
         else{
            i++;
         }        
     }
      return -1;
    }
             
             

    
    
    
    public double avg(){
        double sum = 0.0;
        for (int counter = 0; counter < numbers.length; counter++) {
            sum += numbers[counter];
        }
        return sum / numbers.length;
    }
    
    public double sum(){
        double sum = 0.0;
        for (int counter = 0; counter < numbers.length; counter++) {
            sum += numbers[counter];
        }
        
        return sum;
    }
    
    
    
  
    
    public Numbers() {
    }
    
    public static double[] sortDescending(double[] array)
{
    double[] newArr = new double[array.length];

        System.arraycopy(array, 0, newArr, 0, array.length);

    boolean flag = true;
    double tempValue;

    while(flag) 
    {
        flag = false;

        for(int i = 0; i < newArr.length - 1; i++) 
        {
            if(newArr[i] < newArr[i+1])
            {
                tempValue = newArr[i];
                newArr[i] = newArr[i+1];
                newArr[i+1] = tempValue;
                flag = true;
            }
        }
    }

    return newArr;
}
    
    
    
    public static void main(String[] args) {
        Numbers numero = new Numbers();
        //numero.insert(1);
        System.out.println(numero.insert(1));
        System.out.println(numero.insert(2));
        System.out.println(numero.insert(2));
        System.out.println(numero.insert(2));
        
        numero.delete(1);
        
        for (int i = 0; i < numero.numbers.length; i++) {
            System.out.println(numero.numbers[i]);
        }
        
        System.out.println(numero.avg());
        System.out.println(numero.find(1));
        
        
    }
}



