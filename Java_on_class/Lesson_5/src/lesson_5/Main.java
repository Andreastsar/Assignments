package lesson_5;

public class Main {

    float k = 20;

    public static void main(String[] args) {

        float j;
//        System.out.println(j);
//        System.out.println(k);
        Test myTest = new Test();
        System.out.println(myTest.c);   // the "zero" character
        System.out.println(myTest.i);   // 0
        System.out.println(myTest.b);   // false
        System.out.println(myTest.j);   // 0.0
        System.out.println(myTest.k);   // 0.0
        System.out.println(myTest.s);   // null

        System.out.println("-----------------------------------------------------------------");

        // all of the below are objects , that's why their value is null
        System.out.println(myTest.c1);   // null
        System.out.println(myTest.i1);   // null
        System.out.println(myTest.b1);   // null
        System.out.println(myTest.j1);   // null
        System.out.println(myTest.k1);   // null
    }
}