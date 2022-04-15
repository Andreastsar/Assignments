package models;


import java.util.Arrays;

public class House {
    Room[] rooms;
    String name;

    // Creating Constructors
    public House() {
        rooms = new Room[3];
        rooms[0] = new Room();
        rooms[1] = new Room("kitchen");
        rooms[2] = new Room("bathroom");
        this.name = "John's House";
    }

    // This overloaded Constructor is used for any number of rooms, and the given owner!
    public House(int noOfRooms, String owner) {
        rooms = new Room[noOfRooms];
        rooms[0] = new Room();
        rooms[1] = new Room("Default 1");
        rooms[2] = new Room("Default 2");
        this.name = owner;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House:{ ");
        sb.append("Rooms:").append(Arrays.toString(rooms));
        sb.append(", Owner: '").append(name).append('\'');
        sb.append("}");
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return "House {" + " rooms: " + strRooms() + " }";
//    }
//
//    public String strRooms() {
//        String result = "";
//        for (int i = 0; i < rooms.length; i++) {
//            result += "[" + i + "]=" + rooms[i] + " ";
//        }
//        return result;
//    }
}