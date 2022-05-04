public class Main {

    public static void main(String[] args) {

        System.out.println("Before Division by 0");

        try {
            System.out.println(5/0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("After division by 0");
    }
}