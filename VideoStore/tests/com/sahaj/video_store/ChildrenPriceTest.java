package com.sahaj.video_store;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ChildrenPriceTest {

    private ChildrenPrice childrenPrice;

    @Before
    public void setup(){
        childrenPrice = new ChildrenPrice();
    }

    @Test
    public void shouldReturnProperMovieType(){
        assertEquals(Movie.CHILDREN,childrenPrice.priceCode());
    }

    @Test
    public void shouldReturnRentalCharges(){
        assertEquals(4.5,childrenPrice.charge(5));
    }

}