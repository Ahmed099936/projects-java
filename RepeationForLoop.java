/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeation.pkgfor.loop;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class RepeationForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      int grade;
      int sum=0;
      for (int counter=1;counter<=6;counter ++)
      {
      
      System.out.println("Enter grade for student num "+counter);
      grade =input.nextInt();
      sum+=grade;
      
      
      
      
      }
      System.out.println("the average is "+ sum /6);
    }
    
}

