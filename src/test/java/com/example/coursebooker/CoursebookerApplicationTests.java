package com.example.coursebooker;

import com.example.coursebooker.models.Course;
import com.example.coursebooker.repositories.courseRepositories.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookerApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Autowired
	CourseRepository courseRepository;


	@Test
	public void canFindCourseByStarRating(){
		List<Course> found = courseRepository.findCoursesByStarRating(5);
		assertEquals(1, found.size());
		assertEquals("Intro to Java", found.get(0).getName());
	}

}
