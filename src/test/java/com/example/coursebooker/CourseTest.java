package com.example.coursebooker;

import models.Course;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseTest {

    Course course;

    @Before
    public void before(){
        course = new Course("Intro to Python","Edinburgh", 5);
    }


    @Test
    public void canGetName(){
        assertEquals("Intro to Python", course.getName());
    }

    @Test
    public void canSetName(){
        course.setName("Intro to Java");
        assertEquals("Intro to Java", course.getName());
    }

    @Test
    public void canGetTown(){
        assertEquals("Edinburgh", course.getTown());
    }

    @Test
    public void canSetTown(){
        course.setTown("Glasgow");
        assertEquals("Glasgow", course.getTown());
    }

    @Test
    public void canGetStarRating(){
        assertEquals(5, course.getStarRating());
    }

    @Test
    public void canSetStarRating(){
        course.setStarRating(1);
        assertEquals(1, course.getStarRating());
    }

}
