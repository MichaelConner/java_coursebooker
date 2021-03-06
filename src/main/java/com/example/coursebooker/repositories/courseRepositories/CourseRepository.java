package com.example.coursebooker.repositories.courseRepositories;

import com.example.coursebooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCoursesByStarRating(int starRating);

    List<Course> getCoursesForGivenCustomer(Long customer_id);

}
