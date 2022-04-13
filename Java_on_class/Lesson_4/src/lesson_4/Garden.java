package lesson_4;

public class Garden {

    // Instance Variables (also known as field, properties)
    String name;
    String squareMeters;
    String address;
    Fence[] fences; // Array of type Fence - *** We use Array,
    // cause fences is in plural, so we need many objects of type Fence ***


    // 1. Create a default constructor that assigns the value
    // name = "This is my Garden" to every object
    // 2. Create a defauly constructor that prints the value of name


    // Default Constructor
    public Garden() {
        this.name = "This is my Garden";
        System.out.println(this.name);
    }

    // 3. Create three new instance variables named:
    // squaredMeters(String), address(String), fences(Class)
    public Garden(String squareMeters, String address) {
        this.address = address;
        this.squareMeters = squareMeters;
    }

    // 4. Create an overloaded constructor that initializes fences with the following values:
    // new Fence();
    // new Fence(10);
    // Step 4.1. Create an overloaded constructor with an Array of Fence
    // Step 4.2. Initialize fences
    // Step 4.3. with values : new Fence(), new Fence(10) ?????????

    public Garden(Fence[] fences) {
        this.fences = fences;
    }
}