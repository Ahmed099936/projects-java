/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkgfor.loop;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class ExForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         
         //for (int i=1;i<=10; i+=2)
         //{
         
        // System.out.println(i);
         
         //}
        // for (int i=10;i >=0;i--)
         //{
        // System.out.println(i);
         
         
         //}
         int num;
         int sumeven=0;
         int sumodd=0;
         
         for (int i=1;i<=10;i++)
         {
         
         System.out.println("Enter number "+i);
         num= input.nextInt();
         if (num %2 ==0)
            sumeven+=num;
         else
             sumodd+=num;
        
        
         }
          System.out.println("the sum of even numbers is"+sumeven);
           System.out.println("the sum of odd numbers is"+sumodd);
           
    }
}
    

