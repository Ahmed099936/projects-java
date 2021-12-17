/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision.on.looops;

import java.util.Scanner;

/**
 *
 * @author EL-masreya
 */
public class RevisionOnLooops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            char passclass;
          
           
            double overweight;
            double bagweight ;
            int numofpassenger;
            double charge;
            
            System.out.println("Enter the number of passengers");
             numofpassenger=input.nextInt();
               for (int counter =1;counter<=numofpassenger ;counter++){
            System.out.println("Enter passengers class which num"+counter);
           
         
            passclass=input.next().charAt(0);
            System.out.println("Enter bag weight ");
            bagweight=input.nextDouble();
            switch(passclass)     
            {
                case 'F'  :
             case 'f':
                   
                    if ( bagweight >30)
                    {
                        overweight=bagweight-30;
                        charge= overweight *10 ;
                    System.out.println("you have over weight you should paid "+charge);
                    }
                    break;
                  
             case 'e' :    
             case 'E':
                   
                    if ( bagweight >25)
                    {
                        overweight=bagweight-25;
                        charge= overweight *10 ;
                    System.out.println("you have over weight you should paid "+charge);
                    } 
                    break;
             case 'd':     
             case 'D':
                   
                    if ( bagweight >20)
                    {
                        overweight=bagweight-20;
                        charge= overweight *10 ;
                    System.out.println("you have over weight you should paid "+charge);
                    }
                   break;
             default:
                 System.out.println("you Entered invaild class");
            
            
            }
            }   
    }
    
}
