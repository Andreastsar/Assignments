package lesson_4_exercise;

public class Main {

    public static void main(String[] args) {
        // write your code here

        House myHouse1 = new House();
        House myHouse2 = new House("New house");

        System.out.println("---------------------------------------------------------------");

        Garden myGarden1 = new Garden();

        System.out.println("---------------------------------------------------------------");

        Fence[] fences = new Fence[2];
        fences[0] = new Fence();
        fences[1] = new Fence(10);
        Garden myGarden2 = new Garden("500", "Hrodotoy 16", fences);

        System.out.println("My Garden 2 - Square meters: " + myGarden2.squareMeters + ", Address: " + myGarden2.address +
                ", fence[0].length = " + myGarden2.fences[0].length + ", fence[1].length = " + myGarden2.fences[1].length);
    }
}
