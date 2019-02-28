package com.example.coursebooker.components;

import com.example.coursebooker.models.Booking;
import com.example.coursebooker.models.Course;
import com.example.coursebooker.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

public class DataLoader {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Override
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

        Booking booking2 = new Booking("24-12-2020", python, michael);
        bookingRepository.save(booking2);

    }

}
