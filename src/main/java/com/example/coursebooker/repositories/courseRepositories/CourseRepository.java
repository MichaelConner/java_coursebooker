package com.example.coursebooker.repositories.courseRepositories;

import com.example.coursebooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
