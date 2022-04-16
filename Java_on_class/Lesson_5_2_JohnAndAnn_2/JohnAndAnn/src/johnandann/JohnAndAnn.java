/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package johnandann;

import models.House;

/**
 *
 * @author mac
 */
public class JohnAndAnn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Assume that John has a house.
            This house has three (3) rooms.
            Each room has a door and a window.
            The living room has a door to a garden.
            John and Ann (the cat) are inside the living room.
            John decides to open the door that leads to the garden.
            Ann runs to the garden.
        */
        // Create an pplication that does tha above!
        // House, Human, Animal/Cat, Garden, Room, Actions?, Door, Window
        
        // Step 1. Vres ousiastika
        // House, Garden, Room, Door, Window
        
        // Step 2. Hierarchy
        // House
            // Room[]
                // Door
                // Window
            // Garden
        
        House myHouse = new House();
//        Room[] someRooms = new Room[4];
//        someRooms[0] = new Room();
//        myHouse.setRooms(someRooms);
//        System.out.println("No of rooms in myHouse is: " + myHouse.getRooms().length);
//        Room aRoom = myHouse.getRooms()[0];
//        System.out.println(aRoom); // room[0]
////        System.out.println(myHouse.getRooms()[1]);
////        System.out.println(myHouse.getRooms()[2]);
//        System.out.println(myHouse);
//        myHouse.setRooms(null);
        System.out.println(myHouse);

        
        // myHouse
        // myHouse.printRooms() // rooms with just their names
        // myHouse.printRoomsWithInternals(parameter room) Room Room[]
            // House name (or whatever else has) AND
            // print a Room with all the details of the room
        
    }
    
}
