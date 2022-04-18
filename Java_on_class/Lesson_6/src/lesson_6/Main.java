package lesson_6;

// Lesson with George Irakleidis

import models.Circle;
import models.Student;
import models.Trainer;

public class Main {

    public static void main(String[] args) {

//        Circle c1 = new Circle();
//        c1.setR(5);
//        System.out.println(c1);

        Trainer[] trainers = new Trainer[3];
        Trainer t1 = new Trainer("Antonis", "Nikolaoy", "23/10/1976", "nikolaoy@gmail.com", "6998899766", 1600);
        Trainer t2 = new Trainer("Giannis", "Mpekas", "23/12/1986", "mpekas@gmail.com", "6995239766", 1900);
        Trainer t3 = new Trainer("Pantelis", "Marakakis", "2/09/1979", "marakakis@gmail.com", "699886666", 2600);
        trainers[0] = t1;
        trainers[1] = t2;
        trainers[2] = t3;

        float max = 0;
        Trainer richest = null;
        for(int i=0; i< trainers.length; i++) {
            if (trainers[i].getSalary() >= max) {
                max = trainers[i].getSalary();
                richest = trainers[i];
            }
        }
        System.out.println("Richest trainer is: " + richest.getfName() + " " + richest.getlName() + " and his salary is: " + max + " euros.");

//        Student s1 = new Student();
//        System.out.println(t1.getlName());
//        System.out.println(t1);
    }
}