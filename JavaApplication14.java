/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         int choice;
         int celi;
         int fahr;
         System.out.println("Enter your choice:");
         System.out.println("1.temp with fahrenehit:");
         System.out.println("2.temp with celisious:");
         choice =input.nextInt();
         
         switch (choice)
         {
             case 1:
               System.out.println("1.temp with fahrenehit:");  
         fahr=input.nextInt();
          System.out.println("temp is fahrenhiet");  
          break;
           case 2:
               System.out.println("2.temp with celisious :");  
         celi=input.nextInt();
          System.out.println("temp is celisious");  
          break;
         
         
         }
    }
    
}
