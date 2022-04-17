/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 * @author mac
 */
public class Room {
    // Composition : (has a)
    private String name;
    private Door door;
    private Window window;
    private boolean isLivingRoom;
    private Human human;
    private Animal animal;


    public Room() {
        this.name = "No Name";
        this.door = new Door();
        this.window = new Window();
        isLivingRoom = false;
    }

    public Room(String name) {
        this();     // call the default constructor
        this.name = name;
    }

    public Room(String name, Door door) {
        this(); // default constructor
        this.door = door;
        this.name = name;
    }

    public Room(String name, Door door, Window window) {
        this.name = name;
        this.door = door;
        this.window = window;
    }

    public Room(String name, Window window) {
        this.name = name;
        this.window = window;
    }

    public Room(String name, Door door, Window window, boolean isLivingRoom) {
        this(name, door, window);     // overloaded constructor name, window
        this.isLivingRoom = isLivingRoom;
//        if (isLivingRoom) { // leads to a garden
//            this.door = new Door(); // put something here
//        } else {
//            this.door = door;   // does not lead to a garden
//        }
    }

    public String getName() {
        return (name.toUpperCase());
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

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
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
        final StringBuilder sb = new StringBuilder("Room{");
        sb.append("name='").append(name).append('\'');
        sb.append(", door=").append(door);
        sb.append(", window=").append(window);
        sb.append(", isLivingRoom=").append(isLivingRoom);
        if(human != null) {
            sb.append(", human=").append(human);
        }
        sb.append(", animal=").append(animal);
        sb.append('}');
        return sb.toString();
    }
}
