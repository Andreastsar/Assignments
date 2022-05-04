package TestPackage;

public class Test {

    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be accessed without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be accessed by creating object");
    }

    public static void main(String[] args) {
        myStaticMethod();

        // Non static methods need to create an object to be called.
        Test myObject = new Test();
        myObject.myPublicMethod();
    }

}