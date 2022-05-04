package lesson_8_exercises;

public abstract class Shape {
    private double points;

    public Shape(double p) {
       points = p;
    }

    public double getPoints() {
        return points;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract double displayShapeData();

}
