/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        double fahr ;
        double celi ;
        
        System.out.println("Enter temperature in celsius");
        celi=input.nextFloat();
        
        fahr=celi/5*9+32;
        
        System.out.println("degree are "+fahr);
    }
    
}
