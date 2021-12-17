/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.statement;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class WhileStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input =new Scanner(System.in);
         int guest;
         int rand;
         rand = ( int) (Math.random()*100);
         boolean stillplaying =true;
         System.out.println("generated random number is " +rand);
         while(stillplaying)
         {
         System.out.println("Guess a number between 0 and 100");
         
         guest=input.nextInt();
         if (guest>rand)
             System.out.println("guess too large");
         else
             if (guest<rand )
                 System.out.println("guess to small");
         else
             {
             System.out.println("you win$$$$");
             stillplaying =false;
             
             }
         
         
         
         }
    }
    
}
