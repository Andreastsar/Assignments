package models;

import java.util.Comparator;

public class DepositorByName implements Comparator<Depositor> {

    @Override
    public int compare(Depositor o1, Depositor o2) {
        String myName = o1.getName();
        String otherName = o2.getName();
        int result = myName.compareTo(otherName);
        return result;
    }
}
