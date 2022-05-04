/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;


public class OtherClass implements User {

    @Override
    public int login(String Username, String Password) {
        return 1;
         }

    @Override
    public int register(String Email) {
    return 1;
    }
    
    
    public void vip(){
System.out.println("Eisai VIP");
}

}
