public class Engine implements Cloneable {
    private int cylinders;
    private int horsepower;

    public Engine(int cylinders, int horsepower) {
        this.cylinders = cylinders;
        this.horsepower = horsepower;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        return "Engine{" +
                "cylinders=" + cylinders +
                ", horsepower=" + horsepower +
                '}';
    }
}
