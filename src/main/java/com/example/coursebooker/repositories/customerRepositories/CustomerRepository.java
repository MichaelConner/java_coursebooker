package com.example.coursebooker.repositories.customerRepositories;

import com.example.coursebooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {



}
