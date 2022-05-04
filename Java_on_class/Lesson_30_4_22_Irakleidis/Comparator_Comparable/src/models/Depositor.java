package models;

import Exceptions.NoMoneyException;

import java.time.LocalDate;

public class Depositor implements Comparable {      // Comparable Interface
    private String name;
    private LocalDate dob;
    private double balance;

    public Depositor(String name, LocalDate dob, double balance) {
        this.name = name;
        this.dob = dob;
        this.balance = balance;
    }

    // METHODS-------------------------------------------------------------------------------------

    public void withdraw(double amount) {
        //Αν δεν εχει αρκετο υπολοιπο , τοτε κανε throw το exception που φτιαξαμε.
        if (amount <= balance) {
            balance -= amount;
        } else{
            throw new NoMoneyException("Your balance is not enough, you can withdraw max: " + balance + " Euros");
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    // CompareTo from Comparable Interface
    @Override
    public int compareTo(Object o) {
        Depositor temp = (Depositor) o;
        // Κανουμε Double τα 2 συγκρινομενα double fields , γιατι αν πχ το ενα ειναι 10.05 και 10.54
        // τοτε θα γυρισει int = 0 , δηλαδη αυτοι οι 2 βγαινουν ιδοι. Οποτε χρησιμοποιουμε την Double κλαση
        // για να γυρισει αφου συγκριθουν τα 2 Double objects, με την μεθοδο που υπαρχει στην Double κλαση,
        // την compareTo().
        Double myBalance = this.balance;
        Double otherBalance = temp.balance;
        return (int) myBalance.compareTo(otherBalance);
//        return (int)(myBalance-otherBalance); Αυτο μπορει να μας επιστρεψει 0 αν το αφησουμε ετσι ενω τα doubles ειναι διαφορετικα.
    }

    // SETTER - GETTER -----------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Depositor{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", balance=" + balance +
                '}';
    }
}
