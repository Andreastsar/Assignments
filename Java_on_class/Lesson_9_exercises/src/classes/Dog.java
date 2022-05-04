package classes;

import interfaces.Animal;

public abstract class Dog implements Animal {

    @Override
    public void eat() {
        //Dog eats specific food
    }

    @Override
    public void sleep() {
        // Dog sleep some hours
    }

    @Override
    public void speak() {
        // Dog is barking
    }
}
