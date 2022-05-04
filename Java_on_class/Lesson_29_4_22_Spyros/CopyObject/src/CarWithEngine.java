public class CarWithEngine implements Cloneable {
    private String brand;
    private Engine engine;

    public CarWithEngine(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    //Copy Constructor σε κλάση που περιέχει object.
    public CarWithEngine(CarWithEngine original) {
        this.brand = original.brand;
        // this.engine = original.engine ---> SHALLOW COPY
        Engine e = new Engine(original.engine.getCylinders(),original.engine.getHorsepower()); // DEEP COPY of original ENGINE
        this.engine = e;
        // Αλλιως, μπορουμε να φτιαξουμε εναν COPY CONSTRUCTOR στην ENGINE ,
        // και να τον καλεσουμε μεσα σε αυτον τον COPY CONSTR. , θα αποφευγαμε τον σιδηροδρομο στην γραμμη 14
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Φτιαχνω την clone για να μας κανει DEEP COPY
    @Override
    protected Object clone() throws CloneNotSupportedException {
        CarWithEngine newcar = (CarWithEngine) super.clone();
        newcar.setEngine((Engine) this.engine.clone());
        return newcar;
    }

    @Override
    public String toString() {
        return "CarWithEngine{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}