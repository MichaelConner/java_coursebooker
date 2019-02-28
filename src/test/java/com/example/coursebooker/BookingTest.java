package com.example.coursebooker;

import models.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;

    @Before
    public void before(){
        booking = new Booking("24-12-2020");
    }

    @Test
    public void canGetDate(){
        assertEquals("24-12-2020", booking.getDate());
    }

    @Test
    public void canSetDate(){
        booking.setDate("25-12-2020");
        assertEquals("25-12-2020", booking.getDate());
    }

}

