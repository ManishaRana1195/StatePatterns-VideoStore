package com.sahaj.video_store;

public class Rental extends DomainObject {
    private Tape tape;
    private int daysRented;

    public Rental(Tape tape, int daysRented) {
        this.tape = tape;
        this.daysRented = daysRented;
    }

    public Tape tape() {
        return tape;
    }

    public double charge() {
        return this.tape().movie().charge(daysRented);
    }

    public int bonusPoints() {
        return this.tape().movie().bonusPoints(daysRented);
    }
}