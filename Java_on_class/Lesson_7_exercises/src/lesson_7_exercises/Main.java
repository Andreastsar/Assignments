package lesson_7_exercises;

// Cake exercises - George Irakleidis

// POLYMPORPHISM - SUPER / SUB CLASSES - ARRAYLIST<> - STATIC

import models.Cake;
import models.OrderCake;
import models.ReadyMadeCake;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cake[] cakes = new Cake[5];

        // ARRAYLIST
        ArrayList<Cake> cakeList = new ArrayList();
        // cakeList.size();
        // cakeList.get(0);  0 is for index
        // cakeList.add(object)

        cakes[0] = new OrderCake("Andreas", 25, 0.6);
        cakes[1] = new OrderCake("George", 20, 0.6);
        cakes[2] = new ReadyMadeCake("Dapnhe", 15.0, 10);
        cakes[3] = new ReadyMadeCake("Antonis", 13.0, 12);
        cakes[4] = new ReadyMadeCake("Maria", 18.0, 5);

        double sum = 0;
        for (int i = 0; i < cakes.length; i++) {
            sum += cakes[i].calcPrice();
            cakeList.add(cakes[i]);
        }

        System.out.println("Price for all cakes is: " + sum + " euros.");
        System.out.println("ArrayList cakeList: " + cakeList);

        // using the static variable number from class Cake
        System.out.println("Cake Numbers created (using static variable number) is : " + Cake.number);
    }
}