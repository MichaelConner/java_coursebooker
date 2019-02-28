package com.example.coursebooker.components;

import com.example.coursebooker.models.Booking;
import com.example.coursebooker.models.Course;
import com.example.coursebooker.models.Customer;
import com.example.coursebooker.repositories.bookingRepositories.BookingRepository;
import com.example.coursebooker.repositories.courseRepositories.CourseRepository;
import com.example.coursebooker.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) throws Exception {

        Customer raul = new Customer("Raul","Edinburgh", 21);
        customerRepository.save(raul);

        Customer michael = new Customer("Michael","Niddrie", 32);
        customerRepository.save(michael);



        Course java = new Course("Intro to Java", "Edinburgh", 5);
        courseRepository.save(java);

        Course python = new Course("Intro to Python", "Glasgow", 1);
        courseRepository.save(python);



        Booking booking1 = new Booking("24-12-2020", java, raul);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("25-12-2020", python, michael);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("25-12-2020", python, raul);
        bookingRepository.save(booking3);

    }

}
