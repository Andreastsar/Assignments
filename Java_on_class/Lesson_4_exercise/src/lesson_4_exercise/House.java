package lesson_4_exercise;

public class House {
    String name;

    public House() {
        name = "This is a House, created by the Default Constructor";
        System.out.println(name);
    }

    public House(String name) {
        this.name = name;
        System.out.println("This is a " + this.name + ", created by the Overloaded Constructor");
    }
}
