/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         int counter=1;
         int sum=0;
         int grade=0;
         System.out.println("Enter 6 grade to do the average");
         do
         {
         
         System.out .println("enter grade for student no "+counter);
         grade= input.nextInt();
      sum+=grade ;
         counter++;
         
         
         
         }
         
        while ( counter<=5) ;
         System.out.println("Average of the 6 grades is"+sum/6);
         
         
         
    }
    
}
