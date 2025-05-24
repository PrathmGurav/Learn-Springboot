package com.LearnSpringBoot.Learn_SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn Java", "CodeWithMe"), 
				new Course(2, "Learn Spring", "in28Minutes"),
				new Course(3, "Learn Maths", "JavaGuid"));
	}

}
