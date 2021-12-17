/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int old;
        int year;
        int peresent ;
        
        System.out.println("Enter your date of birth");
        old = input.nextInt();
        
           System.out.println("Enter the year now");
           peresent= input.nextInt();
        year=2020 -old;
        
        System.out.println("your age isyou were born in "+year+"actualy");
    }
    
}
