package lesson_2;

public class Main {

    public static void main(String[] args) {

        //int x = 250;
        //int y = 250;
        //float vat = 1.24f;
        //int sum = x + y;
        //System.out.println("The sum is : " + (sum * vat));

        // Variables can't start with number f.e. 2x
        //int 2k = 15;

        //int a = 10;
        //System.out.println(a++); --> output is a=10, first prints then increment
        //System.out.println(++a); --> output is a=11, first increments , then prints

        //System.out.println(10/3);     // result = 3 integer
        //System.out.println(10.0/3.0);
        //System.out.println(10.0/3);
        //System.out.println(10/3f);      //floating
        //System.out.println(10/3d);      //double

        //int a = 10;
        //String x = "5";
        //String y = "andreas";
        //System.out.println(a + x);  // returns 105 cause x is a string
        //System.out.println(y.toUpperCase());  // returns UPPER CASE the string

        // The IF statement
//        int money = 500;
//        if (money > 700) {
//            System.out.println("You get the PS5!");
//        }else if(money <= 700 && money >= 300) {
//            System.out.println("You get the PS4!");
//        }else {
//            System.out.println("You are poor, you got nothing!");
//        }

        int x = 5;
        switch (x) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Day! Pick from 1-7");
        }
    }
}
