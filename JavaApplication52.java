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
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     cellphone r1 =new cellphone();
     
      
//System.out.println(r1.getlength());
      //System.out.println(r1.getwidth());
      
//r1.setlength(25);
//      r1.setlwidth(50);
      System.out.println(r1.getmanufact());
     System.out.println(r1.getmodel());
       System.out.println(r1.getreatailprice());
      //  cellphone p1=new cellphone(); 
        //p1.setmanufact("oppo");
        //p1.setmodel("opp+4o A52");
        //p1.setreatailprice(4200);
          cellphone r2 =new cellphone("nokia","s",5000);
           System.out.println(r2.getmanufact());
     System.out.println(r2.getmodel());
       System.out.println(r2.getreatailprice());
    }
    
}
 