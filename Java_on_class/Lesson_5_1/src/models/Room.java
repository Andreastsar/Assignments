package models;

import java.util.Arrays;

public class Room {
    String name;
    Door door;
    Window window;

    public Room() {
        name = "Living Room";
        door = new Door("Living room's door");
        window = new Window("Living room's window");
    }

    public Room(String name) {
        this.name = name;
        door = new Door(name);
        window = new Window(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room:{");
        sb.append("Name='").append(name).append('\'');
        sb.append(", Door:").append(door);
        sb.append(", Window:").append(window);
        sb.append('}');
        return sb.toString();
    }
}
