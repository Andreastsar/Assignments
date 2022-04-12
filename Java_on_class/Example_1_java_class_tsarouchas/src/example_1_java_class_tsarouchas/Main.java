package example_1_java_class_tsarouchas;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arrayInt = new int[10];
        Random r = new Random();
        int randomNum;
        for (int i = 0; i < 10; i++) {
            randomNum = r.nextInt(101);
            arrayInt[i] = randomNum;
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}