package com.sahaj.video_store;

public class Movie extends DomainObject {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private Price price;

    public Movie(String name, Price price) {
        this.name = name;
        this.price = price;
    }


    double charge(int daysRented) {
        return price.charge(daysRented);
    }

    int bonusPoints(int daysRented) {
        return price.bonusPoints(daysRented);
    }


    public void persist() {
        Registrar.add("Movies", this);
    }

    public static Movie get(String name) {
        return (Movie) Registrar.get("Movies", name);
    }
}
