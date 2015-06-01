package com.sahaj.video_store;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NewReleasePriceTest {

    private NewReleasePrice newReleasePrice;

    @Before
    public void setup(){
        newReleasePrice = new NewReleasePrice();
    }

    @Test
    public void shouldReturnProperMovieCode(){
        assertEquals(Movie.NEW_RELEASE,newReleasePrice.priceCode());
    }

    @Test
    public void shouldReturnRentalCharges(){
        assertEquals(15.0,newReleasePrice.charge(5));

    }
}