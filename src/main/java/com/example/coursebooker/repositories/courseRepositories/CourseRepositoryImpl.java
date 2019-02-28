package com.example.coursebooker.repositories.courseRepositories;

import com.example.coursebooker.models.Course;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Course> getCoursesForGivenCustomer(Long customer_id){
        List<Course> results = null;

        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Course.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.add(Restrictions.eq("bookingAlias.customer.id", customer_id));

        results = cr.list();

        return results;
    }

}
