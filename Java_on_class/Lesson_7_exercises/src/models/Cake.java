package models;

public class Cake {
//    static
    public static int number;
    private String name;
    private double rate;

    public Cake(String name, double rate) {
        this.name = name;
        this.rate = rate;
        number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calcPrice() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cake{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rate=").append(rate);
        sb.append('}');
        return sb.toString();
    }
}