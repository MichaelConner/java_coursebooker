package com.example.coursebooker;

import models.Booking;
import models.Course;
import models.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Course course1;
    Course course2;
    Customer customer1;
    Customer customer2;

    @Before
    public void before(){
        course1 = new Course("Intro to Python","Edinburgh", 5);
        course2 = new Course("Intro to Java","Edinburgh", 5);

        customer1 = new Customer("Raul","Edinburgh", 21);
        customer2 = new Customer("Michael","Edinburgh", 21);

        booking = new Booking("24-12-2020", course1, customer1);

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

    @Test
    public void canGetCourse(){
        assertEquals(course1, booking.getCourse());
    }

    @Test
    public void canSetCourse(){
        booking.setCourse(course2);
        assertEquals(course2, booking.getCourse());
    }

    @Test
    public void canGetCustomer(){
        assertEquals(customer1, booking.getCustomer());
    }

    @Test
    public void canSetCustomer(){
        booking.setCustomer(customer2);
        assertEquals(customer2, booking.getCustomer());
    }

}

