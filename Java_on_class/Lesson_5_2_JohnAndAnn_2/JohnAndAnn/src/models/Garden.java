package models;

public class Garden {
    private String name;
    private Door door;

    public Garden() {
    }

    public Garden(String name, Door door) {
        this.name = name;
        this.door = door;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Garden{");
        sb.append("name='").append(name).append('\'');
        sb.append(", door=").append(door);
        sb.append('}');
        return sb.toString();
    }
}
