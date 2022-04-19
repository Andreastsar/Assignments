package models;

public class OrderCake extends Cake {
    private double weight;

    public OrderCake(String name, double rate, double weight) {
        super(name, rate);
        this.weight = weight;
    }

    public double calcPrice() {
        return (weight * getRate());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrderCake{");
        sb.append("name=").append(getName());
        sb.append(", weight=").append(weight);
        sb.append(", rate=").append(getRate());
        sb.append('}');
        return sb.toString();
    }
}