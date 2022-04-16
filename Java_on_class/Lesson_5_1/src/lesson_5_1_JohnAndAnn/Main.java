package lesson_5_1_JohnAndAnn;

import models.House;

public class Main {

    public static void main(String[] args) {
	/*
	    Assume that John has a house.
	    This house has three (3) rooms.
	    Each room has a door and a window.
	    The living room has a door to a garden.
	    John and Ann (the cat) are inside the living room.
	    John decides to open the door that leads to the garden.
	    Ann runs to the garden.
	 */
        // Create an application that does the above! (That is before getter-setter and access Modifiers)

        // Step 1: Possible Classes ---> House, Human, Animal/cat, Garden, Room, Actions?, Door, Window

        // Step 2: Vres ta ousiastika ---> House, Garden, Room, Door, Window

        // Step 3: Hierarchy:
            // House
                // Room[]
                    // Door
                    // Window

        House myHouse = new House();
        System.out.println(myHouse);
        System.out.println("--------------------------------------------------");
        House andreasHouse = new House(3,"Andreas");
        System.out.println(andreasHouse);

        // myHouse
        // myHouse.printRooms() -- rooms with just their names

        // myHouse.printRoomsWithInternals[(parameter room) 1.Room, 2.Rooms]
        // -- print a room
        // House name(or whatever else has) AND
        // with all the details of the room :
        //
    }
}