package com.alialsubhi.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseController {
	
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","SelfLearing"),
				new Course(2,"Learn DevOps","SelfLearing"),
				new Course(3,"Ali AlSubhi","TESTING"),
				new Course(4,"Said Zutti","TESTING")
		);
		
	}

}
