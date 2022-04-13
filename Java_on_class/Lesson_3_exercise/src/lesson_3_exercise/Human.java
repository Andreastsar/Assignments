package lesson_3_exercise;

import java.util.Date;

public class Human {

    String firstName;
    String lastName;
    int age;
    float height;
    float weight;
    String gender;
    String country;
    Date dateOfBirth;

    public void printHumanAttributes() {
        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
        System.out.println("Gender : " + gender);
        System.out.println("Country : " + country);
        System.out.println("Date of Birth : " + dateOfBirth);
    }
}