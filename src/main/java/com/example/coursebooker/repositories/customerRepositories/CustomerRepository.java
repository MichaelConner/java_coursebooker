package com.example.coursebooker.repositories.customerRepositories;

import com.example.coursebooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    List<Customer> getCustomersForGivenCourse(Long course_id);

}
