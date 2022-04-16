package lesson_4;

public class Main {

    public static void main(String[] args) {

        // myHouse is an object type of class House
        House myHouse = new House();    // Creation of an Object <-------- we create an object in order to store it to the memory.
        System.out.println(myHouse);
        myHouse.name = "George's House";

        House myHouse3 = new House(); // new House() constructs -- CONSTRUCTOR

        System.out.println(myHouse.name);// George's House
        House myHouse2 = new House("Another House");
        System.out.println(myHouse2.name);// Something
        System.out.println(myHouse3.name);
        System.out.println("---------------------------------------------------------------------------");


        Garden myGarden = new Garden();
//        String s = myGarden.print();
//        System.out.println(s);

        // Exercise 4.
        Fence[] fences = new Fence[4];     // array of type Fence
        fences[0] = new Fence();
        fences[1] = new Fence(10);
        Garden myGarden2 = new Garden(fences);
//        System.out.println("Garden's name is: " + myGarden2.name);
//        System.out.println("fences[0].length = " + myGarden2.fences[0].length);
//        System.out.println("fences[1].length = " + myGarden2.fences[1].length);

        float[] floats = new float[2];
//        System.out.println(floats[0]);
        System.out.println(myGarden2);
    }
}