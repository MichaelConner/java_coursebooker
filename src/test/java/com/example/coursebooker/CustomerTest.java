package com.example.coursebooker;

import com.example.coursebooker.models.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Raul","Edinburgh", 21);
    }


    @Test
    public void canGetName(){
        assertEquals("Raul", customer.getName());
    }

    @Test
    public void canSetName(){
        customer.setName("Michael");
        assertEquals("Michael", customer.getName());
    }

    @Test
    public void canGetTown(){
        assertEquals("Edinburgh", customer.getTown());
    }

    @Test
    public void canSetTown(){
        customer.setTown("Glasgow");
        assertEquals("Glasgow", customer.getTown());
    }

    @Test
    public void canGetAge(){
        assertEquals(21, customer.getAge());
    }

    @Test
    public void canSetStarRating(){
        customer.setAge(22);
        assertEquals(22, customer.getAge());
    }

}
