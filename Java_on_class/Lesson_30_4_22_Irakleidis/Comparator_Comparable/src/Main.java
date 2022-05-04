import Exceptions.NoMoneyException;
import models.Depositor;
import models.DepositorByBalance;
import models.DepositorByName;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Depositor d1 = new Depositor("Andreas", LocalDate.of(2000, 2, 16), 350);
        Depositor d2 = new Depositor("Sofia", LocalDate.of(2000, 1, 15), 100);
        Depositor d3 = new Depositor("Baggelis", LocalDate.of(2000, 2, 12), 450);

        ArrayList<Depositor> dList = new ArrayList();
        dList.add(d1);
        dList.add(d2);
        dList.add(d3);

        System.out.println("Sorted List (compared balances)");
        // Check .sort() of Collections -- Needs the Comparable interface to be implemented in class
        // in order for the .sort() to work.
        Collections.sort(dList);
        System.out.println(dList);
        System.out.println("----------");
        Collections.reverse(dList);         // First sort --> then reverse the sort.
        System.out.println(dList);
        System.out.println("----------");


        // Η sort() εχει 2 υλοποιησεις, μια με σκετη λιστα, μια με λιστα + Comparator
        // ΚΑΙ ΠΡΕΠΕΙ ΝΑ ΦΤΙΑΞΩ ΠΡΩΤΑ ΕΝΑ ΑΝΤΙΚΕΙΜΕΝΟ ΤΗΣ ΚΛΑΣΗΣ ΠΟΥ ΠΕΡΙΕΧΕΙ ΤΟ COMPARATOR για να δουλεψει η sort()

        DepositorByName cName = new DepositorByName();
        DepositorByBalance cBalance = new DepositorByBalance();
        Collections.sort(dList, cName);
        System.out.println(dList);
        System.out.println("----------");
        Collections.sort(dList, cBalance);
        System.out.println(dList);
        System.out.println("----------");


        // Exceptions - NoMoneyException φτιαγμενο απο εμας
        d1.withdraw(100);
        d1.deposit(250);
        System.out.println(d1);
        try {
            d1.withdraw(1000);
        }
        catch(NoMoneyException e) {
            e.printStackTrace();
        }
        System.out.println("---");

        // Το StackTrace είναι βοηθητικο και μας δειχνει που στο προγραμμα δημιουργηθηκε το σφαλμα, απο κατω προς
        // τα πανω μετα τη main σε ποια μεθοδο δημιουργηθηκε το exception.
    }
}