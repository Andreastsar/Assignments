package lesson_6_exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Water consumption and bill.
        float pagio = 2;
        float totalSum = 0;
        float tax = 5;
        System.out.print("Please input your water consumption (m^3): ");
        float waterConsumption = input.nextFloat();
        input.nextLine();
        if (waterConsumption >= 0 && waterConsumption <= 5) {
            totalSum = calculateFPA(pagio) + tax;
        } else if (waterConsumption <= 10) {
            totalSum = calculateFPA(pagio + (waterConsumption * 0.5f)) + tax;
        } else if (waterConsumption <= 20) {
            totalSum = calculateFPA(pagio + (waterConsumption * 0.7f)) + tax;
        } else {
            totalSum = calculateFPA(pagio + (waterConsumption * 1f)) + tax;
        }
        System.out.println("You must pay: " + totalSum + " euros for your monthly consumption!");
        System.out.println("-------------------------------------------------------------------");

        // calculate workers paycheck
        float paycheck = 0;
        System.out.print("Please enter your working hours: ");
        float workingHours = input.nextFloat();
        input.nextLine();
        if (workingHours >= 0 && workingHours <= 40) {
            paycheck += workingHours * 10;
        } else if (workingHours <= 50) {
            paycheck += (40 * 10) + ((workingHours - 40) * 18);
        } else {
            paycheck += (40 * 10) + ((workingHours - 50) * 25);
        }
        System.out.println("Your paycheck for this month is: " + paycheck + " euros!");
        System.out.println("-------------------------------------------------------------------");

        // isLeap Year or not
        System.out.print("Please enter year to check if it is Leap: ");
        int year = input.nextInt();
        input.nextLine();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year!");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a Leap Year!");
        } else {
            System.out.println("Sorry, " + year + " is not a Leap Year!");
        }
        System.out.println("-------------------------------------------------------------------");

        // isPrime number or not
        System.out.println("Please enter 2 positive integer numbers to find all the prime numbers between them!");
        System.out.print("Enter number #1: ");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.print("Enter number #2: ");
        int num2 = input.nextInt();
        input.nextLine();
        int minNum = num1;
        int maxNum = num2;
        if (num1 < num2) {
            minNum = num1;
            maxNum = num2;
        } else {
            minNum = num2;
            maxNum = num1;
        }
        System.out.println("Prime numbers between " + minNum + "-" + maxNum + " are:");
        for (int i = minNum; i <= maxNum; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static float calculateFPA(float cost) {
        cost += ((cost * 18) / 100);
        return cost;
    }

    static boolean isPrime(int number) {
        number = Math.abs(number);
        int counter = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter > 1) {
            return false;
        } else return true;
    }
}
