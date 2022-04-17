/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Arrays;

/**
 *
 * @author mac
 */
public class House {

    // Access Modifiers
    // public
    // protected
    // private
    // no name == Default

    // Encapsulated field - instance variable
    private Room[] rooms;    // definition
    private String name;
    private Garden garden;
    private Human human;
    private Animal animal;

    
    public House() {
        rooms = new Room[3];    // this is what we created with this line ---> int[] array = new int[3];

        Door livingRoomDoor = new Door("Living Room / Garden");
        Human johnHuman = new Human("John");
        Animal ann = new Animal("Ann");
        this.setAnimal(ann);
        this.setHuman(johnHuman);
        garden = new Garden("My Garden", livingRoomDoor);

        rooms[0] = new Room("Living Room", livingRoomDoor, new Window(), true);
        rooms[0].setHuman(johnHuman);
        rooms[0].setAnimal(ann);
//        rooms[0].setName("Living Room");

        rooms[1] = new Room("Bedroom", new Door("Bedroom Door"));
//        rooms[1].setName("Bed Room");

        rooms[2] = new Room("Bathroom", new Door("Bathroom Door"));
//        rooms[2].setName("BathRoom");
    }
    
    public House(int noOfRooms) {
        rooms = new Room[noOfRooms];
    }

    // read rooms (outside this class , f.e. give access to main to see their value)
    public Room[] getRooms() {
        return(rooms);          // GETTER   // Camel case = lowercase the name of the variable,
                                            // next word starts with Capital
    }

    // Setter rooms
    public void setRooms(Room[] rooms) {
        if (rooms == null) {
            System.out.println("You piece of s...t!");
        }else {
            this.rooms = rooms;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("rooms=").append(Arrays.toString(rooms));
        sb.append(", name='").append(name).append('\'');
        sb.append(", garden=").append(garden);
        sb.append(", human=").append(human);
        sb.append(", animal=").append(animal);
        sb.append('}');
        return sb.toString();
    }
}
