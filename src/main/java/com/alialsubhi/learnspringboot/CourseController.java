package com.alialsubhi.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	//http://localhost:8080/courses
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","SelfLearing"),
				new Course(2,"Learn DevOps","SelfLearing")
				);
		
	}

}
