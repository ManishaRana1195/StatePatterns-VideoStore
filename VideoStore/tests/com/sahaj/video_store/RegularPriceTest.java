package com.sahaj.video_store;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RegularPriceTest {

    private RegularPrice regularPrice;

    @Before
    public void setup(){
        regularPrice = new RegularPrice();
    }

    @Test
    public void shouldReturnProperMovieType(){
        assertEquals(Movie.REGULAR,regularPrice.priceCode());
    }

    @Test
    public void shouldReturnRentalCharges(){
        assertEquals(6.5,regularPrice.charge(5));
    }


}