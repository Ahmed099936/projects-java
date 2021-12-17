/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menue.with.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class MenueWithDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       int option;
       int num1=20;
       int num2=10;
       do
       {
            System.out.println("selsct your choice");
            System.out.println("enter 1.for sum 2 number");
            System.out.println("enter 2.for divide 2 number");
            System.out.println("enter 3.for subrract 2 number");
            System.out.println("0.to Exist");
            option=input.nextInt();
       switch(option)
       {
           case 1:
              System.out.println("the  sum of  2 number is" +(num1 +num2)); 
              break;
           case 2 :
                 System.out.println("dvide of 2 number is" +(num1-num2));
                 break;
           case 3:
                 System.out.println("the subrract of 2 number is"+(num2/num1));
                 break ;
           case 0:
               
                System.out.println("invalid option");     
           
       }
       
       
      }while (option !=0);

    }
    
}
