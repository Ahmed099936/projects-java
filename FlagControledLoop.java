/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flag.controled.loop;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class FlagControledLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double sum=0.0;
        double value;
        boolean positiveinput = true;
        
            while(positiveinput == true)
            {
                System.out.println("Enter the  next positive number");
                value=input.nextDouble();
                if (value<0)
               
               positiveinput =false;
                
               
                else 
                
                sum=sum+value;
                
                
                        
                
            }
       System.out.println("sum of input number is"+sum);
    }
    
}
