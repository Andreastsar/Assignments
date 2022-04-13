package lesson_3_exercise;

public class Garden {

    int numberOfSpecies;
    String type;    // indoor - outdoor
    int squareFeet;
    int numberOfCurrentPlants;
    int numberOfMaxPlants;
    float monthlyCost;

    public void printGardenAttributes() {
        System.out.println("Type of garden : " + type);
        System.out.println("Number of species : " + numberOfSpecies);
        System.out.println("Number of current plants : " + numberOfCurrentPlants);
        System.out.println("Number of maximum plants : " + numberOfMaxPlants);
        System.out.println("Square Feet : " + squareFeet);
        System.out.println("Monthly cost : " + monthlyCost + " euros.");
    }
}