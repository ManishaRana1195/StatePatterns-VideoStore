package com.sahaj.video_store;

/**
 * Created by manisharana on 5/31/15.
 */
abstract class Price {


    private static Price children = new ChildrenPrice();
    private static Price newRelease = new NewReleasePrice();
    private static Price regular = new RegularPrice();

    abstract int priceCode();
    public abstract double charge(int daysRented);

    public int bonusPoints(int daysRented) {
        return 1;
    }
}
