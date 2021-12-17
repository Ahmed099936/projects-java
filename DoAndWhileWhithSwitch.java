/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.and.pkgwhile.whith.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class DoAndWhileWhithSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input =new Scanner(System.in);
            int num1=5;
            int num2 =10;
            int option;
            System.out.println("Enter your choice");
               System.out.println("1.to sum");
               System.out.println("2.to subtract 2nuber");
               System.out.println("3.divide 2 number");
               System.out.println("0.to Exist");
               option=input.nextInt();
          switch( option)
          {
              case 1:
                   System.out.println("the sum of 2 number "+(num1+num2));
                   break;
              case 2:
                   System.out.println("dvide 2 number"+(num1/num2));
                   break;
              case 3:
                    System.out.println("subtract is"+(num1-num2));
                    break;
                    
                    
                      
          
          
          
          
          
          }
          while(option!=0);
    }
    
}
