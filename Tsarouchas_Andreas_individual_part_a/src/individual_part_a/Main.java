package individual_part_a;

import models.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> studentsArrayList = new ArrayList<>();

        // Adding students
        addStudents(input, studentsArrayList);

        // FINAL OUTPUT FOR STUDENTS ENROLLED
        System.out.println("Students enrolled : " + studentsArrayList);


    }

    private static void addStudents(Scanner input, ArrayList<Student> studentsArrayList) {
        boolean addMoreStudents = true;
        while (addMoreStudents) {
            System.out.println("Register as a new Student? 1.Yes / 2.No");
            int confStuReg = input.nextInt();
            input.nextLine();
            if (confStuReg == 1) {
                Student student = new Student();
                System.out.println("---Student Form---");
                System.out.print("Please enter first name: ");
                student.setFirstName(input.nextLine());
                System.out.print("Please enter last name: ");
                student.setLastName(input.nextLine());
                System.out.print("Enter year of Birth: ");
                int yearOfBirth = input.nextInt();
                input.nextLine();
                System.out.print("Enter month (as a number): ");
                int monthOfBirth = input.nextInt();
                input.nextLine();
                System.out.print("Enter day (as a number): ");
                int dayOfBirth = input.nextInt();
                input.nextLine();
                student.setDateOfBirth(LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth));
                System.out.print("Please enter tuition Fees: ");
                float tuitionFees = input.nextFloat();
                input.nextLine();
                student.setTuitionFees(tuitionFees);
                studentsArrayList.add(student);
            } else {
                if (studentsArrayList.size() == 0) {
                    studentsArrayList.add(new Student());
                }
                break;
            }
        }
    }
}