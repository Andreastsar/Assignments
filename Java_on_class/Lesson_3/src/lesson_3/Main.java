package lesson_3;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Pasparakis George - Lesson 1 - Overview of Basic Java components.

        Scanner scanner = new Scanner(System.in);

        Test test = new Test();
        test.printSomeVariables();

        Car car = new Car();
        car.hp = 340;
        car.maxSpeed = 510;
        car.name = "I don't exist";
        car.yearOfProduction = new Date("2047/01/01");
        System.out.println("car = " + car.name);
    }
}