package com.sahaj.video_store;

/**
 * Created by manisharana on 5/31/15.
 */
public class ChildrenPrice extends Price {
    @Override
    public int priceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double charge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;

        return result;
    }
    @Override
    public int bonusPoints(int daysRented) {
        return 1;
    }

}
