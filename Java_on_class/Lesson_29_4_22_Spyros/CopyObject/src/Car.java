public class Car {

    private String brand;
    private int cylinders;
    private int horsepower;

    public Car(String brand, int cylinders, int horsepower) {
        this.brand = brand;
        this.cylinders = cylinders;
        this.horsepower = horsepower;
    }

    // Copy Constructor
    public Car(Car car) {
//        this(car.brand,car.cylinders,car.horsepower);         // This is the second way of the Copy Constructor (deep copy), using only this line
        this.brand = car.brand;
        this.cylinders = car.cylinders;
        this.horsepower = car.horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", cylinders=" + cylinders +
                ", horsepower=" + horsepower +
                '}';
    }
}
