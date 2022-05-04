package lesson_8_2_exercises;

import models.Android;
import models.NonAndroid;
import models.Phone;

public class Main {

    public static void main(String[] args) {

        Android Samsung = new Android("Samsung Neo 5");

        NonAndroid Appricot = new NonAndroid("IPhone 14");

        System.out.println(Samsung.getBrand() + " " + Samsung.getPhonePrice());
        System.out.println(Appricot.getBrand() + " " + Appricot.getPhonePrice());

        Phone[] phones = new Phone[10];

        phones[0] = new Android("Samsung Galaxy S22");
        phones[1] = new Android("Samsung Galaxy S22 Ultra");

        System.out.println(phones[0]);

    }
}
