package com.sahaj.video_store;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Customer extends DomainObject {
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String statement() {

        String result = "Rental Record for " + name() + "\n";
        for (Rental each : rentals) {
            result += "\t" + each.tape().movie().name() + "\t" + String.valueOf(charge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(charge()) + "\n";
        result += "You earned " + String.valueOf(bonusPoints()) + " frequent renter points";
        return result;

    }

    private double charge() {
        double result = 0;
        Iterator<Rental> rental = rentals.iterator();
        while (rental.hasNext()) {
            Rental each = rental.next();
            result += each.charge();
        }
        return result;
    }

    private int bonusPoints() {
        int frequentRentPoints = 0;
        Iterator<Rental> rental = rentals.iterator();
        while (rental.hasNext()) {
            Rental each = rental.next();
            frequentRentPoints += each.bonusPoints();
        }
        return frequentRentPoints;
    }


    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public static Customer get(String name) {
        return (Customer) Registrar.get("Customers", name);
    }

    public void persist() {
        Registrar.add("Customers", this);
    }
}