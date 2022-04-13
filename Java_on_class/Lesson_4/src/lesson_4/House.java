package lesson_4;

import java.lang.reflect.Constructor;

public class House {
    // instance variables
    String name;

//    public House() {} ---> Default Constructor (even if we don't write this, it is implied - ALWAYS EXISTS)
//    only one exception  -- IF WE CREATE AN OVERLOADED CONSTRUCTOR, WE MUST INITIALIZE THE DEFAULT CONSTRUCTOR ASWELL
//    *** It is named DEFAULT cause NO PARAMETERS ***
//    Constructor is running in the program BEFORE EVERYTHING ELSE


    // Default Constructor -- NO returning value (void, int, etc..)
    public House() {
        name = "Something";
        System.out.println("A house!");
    }

    // Overloaded Constructor
    // this refers to the Instance Variable "String name;"
    public House(String name) {
        this.name = name;
    }
}