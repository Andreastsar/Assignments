package models;

public abstract class Phone {
    private String brand;
    public double phonePrice;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPhonePrice() {
        return phonePrice;
    }

    public abstract void setPhonePrice();

}
