package models;

public class Door {
    String name;

    public Door() {
        this.name = "Default door";
    }

    public Door(String doorName) {
        this.name = doorName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("Name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
