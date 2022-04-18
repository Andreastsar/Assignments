package models;

// extends

public class Student extends Human {
    private float cost;

    public Student() {
    }

    public Student(String fName, String lName, String dob, String mail, String tel) {
        super(fName, lName, dob, mail, tel);
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }


}
