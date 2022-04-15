package models;

public class Window {
    String name;

    public Window() {
        name = "Default window";
    }

    public Window(String windowName) {
        this.name = windowName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("Name:'").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
