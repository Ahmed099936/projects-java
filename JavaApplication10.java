/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input =new Scanner(System.in);
        
         float gallons;
         double cubic;
         
         System.out.println("Enter the number of gallons");
         gallons=input.nextFloat();
         
         cubic=gallons / 7.481 ;
         
         System.out.println("numer of cubic is"+cubic);
         
         
    }
    
}
