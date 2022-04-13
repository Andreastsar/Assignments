package lesson_3_exercise;

import java.util.Date;

public class House {

    // Class definition of attributes
    String addressName;
    String city;
    int zipCode;
    int addressNumber;
    String country;
    int floors;
    float squareFeet;
    int rooms;
    int parkingSpaces;
    Date dateOfConstruction;
    int bathrooms;

    public void printHouseAttributes() {
        System.out.println("Street address : " + addressName);
        System.out.println("Address Number : " + addressNumber);
        System.out.println("City : " + city);
        System.out.println("Zip Code : " + zipCode);
        System.out.println("Country : " + country);
        System.out.println("Number of rooms : " + rooms);
        System.out.println("Number of bathrooms : " + bathrooms);
        System.out.println("Number of floors : " + floors);
        System.out.println("Square Feet : " + squareFeet);
        System.out.println("Number of parking spaces : " + parkingSpaces);
        System.out.println("Date of construction : " + dateOfConstruction);

    }

}
