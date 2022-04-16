package lesson_4;

public class Fence {
    float length;

    public Fence() {}

    public Fence(float length) {
        this.length = length;
    }

    public String toString() {
        String result = Float.toString(length);     // Float.toString(float f) --> returns a string
        return(result);
    }
}