
package javaapplication9;


public class ElevatedUser implements User {

    @Override
    public int login(String Username, String Password) {
       return 1;
    }

    @Override
    public int register(String Email) {
        return 1;
       }
    
    
    public void deleteuser(int UserId){
    //Delete User from APP
    }
    
    
    
}//end of Arithmetic class
