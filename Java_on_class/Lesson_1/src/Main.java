import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        int intArray[] = {5, 10, 20, 30, 45, 99};
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }


        // for (int i : intArray) ---> For..of (Grabs the values of the array)
//        for (int i : intArray) {
//            System.out.println(i);  // NOT intArray[i] but i
//        }


        //System.out.println(intArray); // does not return the values of the array, but the address memory (.toString()) we will see in the future

        // RANDOM NUMBERS
//        Random r = new Random();
//        int randomNum;
//        int counter = 0;
//        for (int i = 0; i < 1000; i++) {
//            randomNum = r.nextInt(101);
//            System.out.println(randomNum);
//            counter++;
//            if (randomNum == 100) {
//                System.out.println("Times to get 100 : " + counter);
//                break;
//            }
//        }


        // The CONTINUE sends the loop back to the starting FOR, without executing everything that is below it.
//        Random r = new Random();
//        int randomNum;
//        int counter = 0;
//        for (int i=0; i <= 10; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

        //Create an Array with 10 index without declaring their values.
//        int a[] = new int[10];  // default values are 0
//        a[3] = 15;
//        int c[][] = {{2, 3}, {5, 6}};     //declare a 2x2 "matrix" , first row=(2,3), second row=(5,6)
//
//
//        int b[][] = new int[3][4];  // declare a 3x4 "matrix" -- 3 rows, 4 columns
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.println("In place : " + i + "," + j + " of the matrix, it's value is: " + b[i][j]);
//            }
//        }

        // Multiplication of given number from user
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number :");
//        int x = input.nextInt();
//        for (int i=1; i <= 10; i++) {
//            System.out.println("The output of " + x + " x " + i + " = " + (i*x));
//        }


        // Sum of x given numbers
//        int sum = 0;                    // we must declare a starting value for the variable sum ( int sum; does not work)
//        for (int i=0; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println("Sum of numbers from 1-100 is : " + sum);


        // Sum of 100 random numbers
//        Random r = new Random();
//        int sum = 0;
//        for (int i=0; i<100; i++) {
//            System.out.println(r.nextInt(101));
//            sum += r.nextInt(101);
//        }
//        System.out.println("The sum of 100 random numbers from 1-100 is : " +sum);


        // Array with 100 random values
        int arrayRand[] = new int[100];
        Random r = new Random();
        int randomNum;
        for (int i=0; i < 100; i++) {
            randomNum = r.nextInt(101);
            arrayRand[i] = randomNum;
        }
        for (int i : arrayRand) {
            System.out.print(Arrays.toString(arrayRand));           // the Arrays.toString(my_array) displays the values of the array in one line as an actually Array.
        }

    }
}