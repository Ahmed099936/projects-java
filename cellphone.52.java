
package javaapplication52;


public class cellphone {
    
    
    private String manufact ;
    private String model ;
    private int reatailprice ;
    
    public cellphone ()
    {
    manufact ="oppo";
    model ="A";
    reatailprice =5000;
     
    }
    public cellphone(String man ,String mod ,int reat)
    {
    manufact = man;
    model =mod ;
    reatailprice = reat ;
    
    
    }
    public void setmanufact(String man)
        {
    manufact= man ;
    
    
        }
    
     public void setmodel(String mod)
        {
    model= mod ;
    
         }
     
    public void setreatailprice(int reat)
        {
   reatailprice= reat ;
    
        }
  
     public String getmanufact()
     {
     
     return manufact;
     
     }
     
        public String getmodel()
     {
     
     return model;
     
     }
        
        
      public int getreatailprice()
        {
     
     return  reatailprice ;
     
        }
}
