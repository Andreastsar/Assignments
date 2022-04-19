package models;

public class ReadyMadeCake extends Cake {
    private int quantity;

    public ReadyMadeCake(String name, double rate, int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        return (quantity * getRate());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReadyMadeCake{");
        sb.append("name=").append(getName());
        sb.append(", quantity=").append(quantity);
        sb.append(", rate=").append(getRate());
        sb.append('}');
        return sb.toString();
    }
}