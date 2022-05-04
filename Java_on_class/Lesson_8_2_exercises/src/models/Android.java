package models;

public class Android extends Phone{

    public Android(String brand) {
        super(brand);
        setPhonePrice();
    }

    @Override
    public void setPhonePrice() {
        phonePrice = 24.99;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Android{");
        sb.append(" Brand: ").append(getBrand());
        sb.append(", phonePrice = ").append(phonePrice);
        sb.append('}');
        return sb.toString();
    }
}