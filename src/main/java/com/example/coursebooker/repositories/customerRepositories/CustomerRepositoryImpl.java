package com.example.coursebooker.repositories.customerRepositories;

import com.example.coursebooker.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Customer> getCustomersForGivenCourse(Long course_id){
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.add(Restrictions.eq("bookingAlias.course.id", course_id));

        results = cr.list();

        return results;
    }

}
