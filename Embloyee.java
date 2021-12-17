/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embloyee;

/**
 *
 * @author EL-masreya
 */
public class Embloyee {

    
   
    public static void main(String[] args) {
        Embloyees r1= new Embloyees(100,"Ahmed",true);
        r1.print_emp_data();
        Embloyees r2 =new Embloyees(300,"Ali",true,500,"Acounting",3000);
        r2.print_emp_data();
    }
    
}
