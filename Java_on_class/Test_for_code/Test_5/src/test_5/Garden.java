package test_5;

public class Garden {
    String name;
    String squareMeters;
    String address;
    Fences[] fences;

    public Garden() {
        this.name = "Defaul name for all Gardens";
        System.out.println(this.name);
    }

    public Garden(Fences[] fences) {
        this.fences = fences;
//        this.fences = new Fences();
//        this.fences = new Fences(10);

    }
}