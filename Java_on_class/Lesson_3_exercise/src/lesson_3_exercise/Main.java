package lesson_3_exercise;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        House house1 = new House();
        house1.parkingSpaces = 2;
        house1.squareFeet = 140;
        house1.country = "Greece";
        house1.dateOfConstruction = new Date("1978/03/24");
        house1.bathrooms = 1;
        house1.floors = 1;
        house1.zipCode = 13526;
        house1.addressName = "Irodotoy";
        house1.addressNumber = 44;
        house1.city = "Athens";
        house1.rooms = 4;
        house1.printHouseAttributes();
        house1.price = 120000;

        System.out.println("------------------------------------------------------");

        Human human1 = new Human();
        human1.dateOfBirth = new Date("1986/10/24");
        human1.gender = "Male";
        human1.firstName = "Jason";
        human1.lastName = "Bourne";
        human1.weight = 124.5f;
        human1.height = 1.87f;
        human1.country = "Spain";
        human1.age = 36;
        human1.printHumanAttributes();

        System.out.println("------------------------------------------------------");

        Garden garden1 = new Garden();
        garden1.monthlyCost = 4600;
        garden1.numberOfMaxPlants = 3000;
        garden1.numberOfCurrentPlants = 1678;
        garden1.type = "Indoor";
        garden1.numberOfSpecies = 194;
        garden1.squareFeet = 5000;
        garden1.printGardenAttributes();
    }
}
