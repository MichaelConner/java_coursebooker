package com.example.coursebooker.repositories.courseRepositories;

import com.example.coursebooker.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCoursesForGivenCustomer(Long customer_id);
}
