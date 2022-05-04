package models;

public class Duck {
    private String name;
    private String color;
    private int size;

    public Duck(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void eat() {
        System.out.println("Duck is eating");
    }

    public void draw(){};
}// end of duck class