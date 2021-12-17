/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

/**
 *
 * @author EL-masreya
 */
public class rectangle {
    private double length ;
    private  double width ;
    
    public rectangle ()
    {
    length =10;
    width =15 ;
    System.out.println("this is ex for constructor");
    
    }
    public rectangle (double l ,double m)
    {
    length =l ;
    width = m ;
    
    
    }
    public void setlength (double l)
    {
    length =l;
   
    }
    public void setlwidth (double w)
    {
    width =w;
   
    }
    public double getlength ()
    {
   return length ;
   
    } 
    
    
     public double getwidth ()
    {
   return width ;
   
    } 
     
      public double getArea ()
    {
   return length*width ;
   
    } 
}
