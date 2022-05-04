package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private float tuitionFees;

    public Student() {
        firstName = "Jane";
        lastName = "Doe";
        dateOfBirth = LocalDate.of(2002,6,22);
        tuitionFees = 500;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(float tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student:{");
        sb.append("First Name:'").append(firstName).append('\'');
        sb.append(", Last Name:'").append(lastName).append('\'');
        sb.append(", Date Of Birth:'").append(dateOfBirth).append('\'');
        sb.append(", Tuition Fees: ").append(tuitionFees).append(" euros");
        sb.append('}');
        return sb.toString();
    }
}
