import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Andreas\\Desktop\\GitHub\\Assignments\\Java_on_class\\Lesson_30_4_22_Irakleidis\\ReadFromFile\\j.txt");
        try {
            Scanner input = new Scanner(f);     // Κανουμε input το αρχειο μεσω Scanner
            while(input.hasNextLine()){         // Όσο υπάρχει επόμενη γραμμη (στο αρχειο), τοτε
                String line = input.nextLine(); // διαβασε την γραμμη,
                System.out.println(line);       // τυπωσε τη γραμμη.
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
