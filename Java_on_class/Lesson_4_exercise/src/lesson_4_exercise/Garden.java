package lesson_4_exercise;

public class Garden {
    String name;
    String squareMeters;
    String address;
    Fence[] fences;

    public Garden() {
        this.name = "This is my Garden";
        System.out.println(this.name);
    }

    public Garden(String squareMeters, String address, Fence[] fences) {
        this.squareMeters = squareMeters;
        this.address = address;
        this.fences = fences;
    }

}
