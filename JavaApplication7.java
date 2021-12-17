/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input =new Scanner(System.in);
       char ch ;
      System.out.println("Enter charcter to test");
      ch =input.next().charAt(0);
      switch (ch)
              {
      case'a':
          case'e':
              case'o':
                  case'i':
                  case 'u':
                      System.out.println("this is vowel");
                      break;
                  default:
                      System.out.println("this is normal ");
      
      
      
      }
      
      
      
    }
    
}
