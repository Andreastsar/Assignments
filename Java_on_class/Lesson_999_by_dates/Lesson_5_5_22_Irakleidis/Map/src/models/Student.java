package models;

public class Student {
    private String name;
    private String lName;
    private int fees;

    public Student(String name, String lName, int fees) {
        this.name = name;
        this.lName = lName;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lName='" + lName + '\'' +
                ", fees=" + fees +
                '}';
    }
}
