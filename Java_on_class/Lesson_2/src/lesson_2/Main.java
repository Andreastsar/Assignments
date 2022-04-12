package lesson_2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Lesson 2 - Java Coding Bootcamp - (George Irakleidis)

        //COMPARE 2 STRINGS -- ** ALWAYS WITH THE .equals() METHOD **
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str3);
        System.out.println(str1 == str2);   //True cause both declared direct as Strings.
        System.out.println(str1 == str3);   //False, cause of new String.
        System.out.println(str1.equals(str3));
        //-----------------------------------------------------------------------------------------

        // Multiplication of given number from user -- using the .printf() method.
        //Creating Formatted Strings
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int x = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            // instead of : System.out.println("The output of " + x + " x " + i + " = " + (i * x));
            System.out.printf("%d * %d = $d \n", x, i, (x * i));    // formatted string
        }
        //-----------------------------------------------------------------------------------------

        someName("George");
        int a = sumTwoNumbers(15, 27);
        int b = sumTwoNumbers(36, -16);
        int c = sumTwoNumbers(-2, 52);
        int s = a + b + c;
        System.out.println(s);

        System.out.println(sumOf(2000) + sumOf(3000));
        //-----------------------------------------------------------------------------------------

        //Create an array with 100 random integers, then check how many are odd, and how many are even.
        int[] array1 = new int[100];
        Random randomNum = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomNum.nextInt(101);
        }
        odd_or_even_Numbers(array1);
        //-----------------------------------------------------------------------------------------

    }

    //-------------------------CREATING METHODS + OVERLOADING--------------------------------//
    //---------------------------------------------------------------------------------------//

    //Creating a method with a String parameter.
    static void someName(String name) {
        System.out.println("Hello " + name);
    }
    //-----------------------------------------------------------------------------------------

    //Method that returns the sum of 2 given int numbers.
    static int sumTwoNumbers(int x, int y) {
        return x + y;
    }

    //OVERLOADING the .sumTwoNumbers() method. We can create as many methods as we want,
    // but they must have different type of parameters.
    static float sumTwoNumbers(float x, float y) {
        return x + y;
    }

    static int sumTwoNumbers(int x, int y, int z) {
        return x + y + z;
    }

    static String sumTwoNumbers(String a, String b) {
        return a + " " + b;
    }
    //-----------------------------------------------------------------------------------------

    //Method calculating the sum of 0...N numbers.
    static int sumOf(int N) {
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += i;
        }
        return sum;
    }
    //-----------------------------------------------------------------------------------------

    //Method that finds how many numbers are odd/even and calculate their individual sum.
    static void odd_or_even_Numbers(int[] array) {
        int odd = 0, even = 0, even_sum = 0, odd_sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
                even_sum += array[i];
            } else {
                odd++;
                odd_sum += array[i];
            }
        }
        System.out.println("Even numbers: " + even + " , odd numbers: " + odd);
        System.out.println("Sum of odd numbers: " + odd_sum);
        System.out.println("Sum of even numbers: " + even_sum);
    }
    //-----------------------------------------------------------------------------------------
}