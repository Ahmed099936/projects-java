/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcation;

import java.util.Scanner;
public class Funcation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int num1;
        int num2;
        int num3;
        int total;
        double avg;
        System.out.println("Enter 3 number");
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
        total= sum(num1,num2,num3);
        avg=average(num1,num2,num3);
        display(total ,avg);
                
        
        
    }
   public static int sum (int n1 ,int n2,int n3)
   {
   return n1+ n2 +n3;
   }
   
   
   public static double average (int n1,int n2,int n3)
   {
   return sum(n1,n2,n3)/3;
   }
   
   
   
  public static void display (int s ,double a)
   {
   System.out.println("the sum of 3 number is"+s);
 System.out.println("the averageof 3 number is"+a);  
 
   }
}
