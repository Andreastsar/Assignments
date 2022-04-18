package models;

public class Trainer extends Human {
    private float salary;

    public Trainer() {
    }

    public Trainer(String fName, String lName, String dob, String mail, String tel, float salary) {
        super(fName, lName, dob, mail, tel);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}