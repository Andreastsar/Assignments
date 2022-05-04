public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Car c = new Car("BMW",16,200);

        Car c1 = new Car(c);

        c.setCylinders(25);

        System.out.println(c);
        System.out.println(c1);
        System.out.println("-----------------------------------------------");

        // H clone() κάνει SHALLOW COPY αν απλα την κανουμε override, οταν μεσα στην κλαση υπαρχει ως attribute οτιδηποτε διαφορετικο απο PRIMITIVE + STRING.
        // Οταν φτιαξαμε την clone() ΚΑΙ ΣΤΗΝ ENGINE, αλλα και στην CarWithEngine, τοτε γινεται DEEP COPY
        Engine e = new Engine(12,1000);
        CarWithEngine cwe = new CarWithEngine("Ford",e);

        CarWithEngine copyCWE = (CarWithEngine) cwe.clone();
        cwe.setBrand("Bnw");
        cwe.getEngine().setHorsepower(500);

        System.out.println(copyCWE);
        System.out.println(cwe);

    }
}
