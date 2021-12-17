/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       int choice;
       int num1;
       int num2;
       int resault;
       System.out.println("Enter your choice:");
       System.out.println("1.Add two numers");
       System.out.println("2.get the double of possitive number");
       System.out.println("3.get the square of number");
       choice=input.nextInt();
       
       switch (choice)
       {
           
           case 1:
                System.out.println("1.Add two numers");
           num1=input.nextInt();
           num2=input.nextInt();
           System.out.println(num1+num2);
           break;
           
           case 2:
                System.out.println("1.Add two numers");
           num1=input.nextInt();
           num2=input.nextInt();
           System.out.println(num1-num2);
           
           break;
           case 3:
                System.out.println("1.Add positive numers");
           num1=input.nextInt();
           if (num1>0)
           System.out.println(num1*num1);
           break;
           default :
               System.out.println("invalid choice");
           
       }   
    }
    
}
