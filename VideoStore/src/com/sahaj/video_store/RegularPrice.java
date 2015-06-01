package com.sahaj.video_store;

/**
 * Created by manisharana on 5/31/15.
 */
public class RegularPrice extends Price {
    @Override
    public int priceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double charge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;

        return result;
    }
    @Override
    public int bonusPoints(int daysRented) {
        return 1;
    }
}
