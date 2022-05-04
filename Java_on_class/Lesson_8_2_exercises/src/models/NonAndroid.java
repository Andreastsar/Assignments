package models;

public class NonAndroid extends Phone{

    public NonAndroid(String brand) {
        super(brand);
        setPhonePrice();
    }

    @Override
    public void setPhonePrice() {
        phonePrice = 37.99;
    }

}
