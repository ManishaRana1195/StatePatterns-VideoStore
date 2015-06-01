package com.sahaj.video_store;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    private Rental rental;



    @Test
    public void shouldReturnRentalChargesForRegularMovie(){
        Tape tape = new Tape("10002", new Movie("Avengers", new RegularPrice()));
        rental = new Rental(tape, 5);
        assertEquals(6.5,rental.charge(),0);
    }

    @Test
    public void shouldReturnRentalChargesForChildrenMovie(){
        Tape tape = new Tape("10003", new Movie("Boov", new ChildrenPrice()));
        rental = new Rental(tape, 5);
        assertEquals(4.5,rental.charge(),0);
    }

    @Test
    public void shouldReturnRentalChargesForNewReleaseMovie(){
        Tape tape = new Tape("10005", new Movie("Tanu Weds Manu 2", new NewReleasePrice()));
        rental = new Rental(tape, 5);
        assertEquals(15.0,rental.charge(),0);
    }
    @Test
    public void shouldReturn1asFrequentPointsForRegularMovie(){
        Tape tape = new Tape("10002", new Movie("Avengers", new RegularPrice()));
        rental = new Rental(tape, 5);
        assertEquals(1,rental.bonusPoints());
    }

    @Test
    public void shouldReturn1asFrequentPointsForChildrenMovie(){
        Tape tape = new Tape("10003", new Movie("Boov", new ChildrenPrice()));
        rental = new Rental(tape, 5);
        assertEquals(1,rental.bonusPoints());
    }

    @Test
    public void shouldReturn2asFrequentPointsForNewReleaseMovie(){
        Tape tape = new Tape("10005", new Movie("Tanu Weds Manu 2", new NewReleasePrice()));
        rental = new Rental(tape, 5);
        assertEquals(2,rental.bonusPoints());
    }

}