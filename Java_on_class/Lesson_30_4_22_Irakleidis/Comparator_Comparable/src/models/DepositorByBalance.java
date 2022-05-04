package models;

import java.util.Comparator;

public class DepositorByBalance implements Comparator<Depositor> {

    @Override
    public int compare(Depositor o1, Depositor o2) {
        // Παλι χρησιμοποιωντας την compare της Double επιστρεφεται int (Check compare() )
        int result = Double.compare(o1.getBalance(),o2.getBalance());
        return result;
    }
}
