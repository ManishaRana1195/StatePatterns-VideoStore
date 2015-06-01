package com.sahaj.video_store;

/**
 * Created by manisharana on 5/31/15.
 */
public class NewReleasePrice extends Price {
    @Override
   public int priceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double charge(int daysRented) {
         return daysRented * 3;
        }

    @Override
    public int bonusPoints(int daysRented){
        return (daysRented > 1) ? 2:1;

    }
}
