import models.Student;

import java.util.HashSet;

public class Main_Student_HashSet {
    public static void main(String[] args) {

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("g","s",250));
        studentHashSet.add(new Student("a","d",280));
        studentHashSet.add(new Student("f","h",2900));
        studentHashSet.add(new Student("a","2",150));

        for (Student s : studentHashSet){
            System.out.println(s);
        }

    }
}
