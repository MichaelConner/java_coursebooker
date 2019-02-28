package com.example.coursebooker.repositories.customerRepositories;

import com.example.coursebooker.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getCustomersForGivenCourse(Long course_id);


}
