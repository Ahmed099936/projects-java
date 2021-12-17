/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.project.pkg1;

import java.util.Scanner;

/**
 
 * @author EL-masreya
 */
public class MyProject1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
       /* int pass;
        double weight;
        double overpass;
        System.out.println("Enter your class");
       pass=input.next().charAt(0);
       drawline('*');
       System.out.println("Enter weight");
       weight=input.nextDouble();
       drawline('#');
       
       switch(pass)
       {
           case 'f' :
               if(weight >=30)
               {
                
                    overpass=(weight-30)*10 ;
                   System.out.println("you have over weight  paids over"+overpass); 
               }
                   break;
       
       
       }*/
    System.out.println( Math.sqrt(25)); 
   int v=50 ,   r=20;
    System.out.println(sum(v,r));
   }
             public static void drawline(char ch) 
   
             {   
       
        for (int i=0;i<10;i++)
        {
           
          System.out.print(ch);
        }
          System.out.println();
              }
             public static int sum(int h ,int u)
            {
            int result;
            result=h+u;
            return result;
            
            } 
}
