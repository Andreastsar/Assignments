
package oop63;


public class ToTestInt { //Here is my main() 
    
     public static void main(String[] args) {
         
     System.out.println("calling from ToTestInt class main method");
    
     Test t=new Arithmetic();
     
     Arithmetic a=new Arithmetic();
    
   
     
   //Δοκιμάστε a. να δείτε τι συναρτήσεις σας βγάζει.

      //Δοκιμάστε t. να δείτε τι συναρτήσεις σας βγάζει.
   
     System.out.println("--------------------------------------------------------");
     
     System.out.println("created object of the Interface-Reference Arithmetic class");
     
     System.out.println("Hence Arithmetic class method square called");
      
     System.out.println("This object cannot call armeth method of Arithmetic class");
     
     t.square(10);
     
     
      
     System.out.println("--------------------------------------------------------");
    }

}//end of ToTestInt class
