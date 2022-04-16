package lesson_4;

public class Garden {

    // Instance Variables (also known as field, properties)
    String name;
    String squareMeters;
    String address;
    Fence[] fences; // Array of type Fence - *** We use Array,
    // cause fences is in plural, so we need many objects of type Fence for the same object(Garden object 1 f.e. has 3 fences) ***
    float[] floats;


    // 1. Create a default constructor that assigns the value
    // name = "This is my Garden" to every object
    // 2. Create a default constructor that prints the value of name


    // Default Constructor
    public Garden() {
        this.name = "This is my Garden";
        System.out.println(this.name);
        fences = new Fence[2];
        System.out.println(fences == null);     // false
        System.out.println(fences[0] == null);  // true
        floats = new float[2];
        System.out.println(floats[0]);  // value of floats[0]=0.0 cause floats is a primitive type (default value = 0.0)
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
//        this.fences = new Fence();
//        this.fences = new Fence(10);
    }

    public String toString() {
        String strFences = strFences();
        String result = "Garden {";
        result += "Name: " + name + ", Address: " + address + ", Square meters: " + squareMeters;
        result += ", Fences: ";     // + fences[0] + ", [1]= " + fences[1]  + " }";
        result += strFences + " }";
        return result;
    }

    private String strFences() {
        String strFences = "";
        for(int i = 0; i < fences.length; i++) {
            if(i == fences.length-1) {
                strFences += "[" + i + "].length = " + fences[i] + ".";
            }else {
                strFences += "[" + i + "].length = " + fences[i] + ", ";
            }
        }
        return strFences;
    }
}