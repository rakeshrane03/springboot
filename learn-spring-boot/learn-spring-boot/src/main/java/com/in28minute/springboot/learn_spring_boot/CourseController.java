package com.in28minute.springboot.learn_spring_boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retraiveAllCourses() {
		return Arrays.asList(new Course(1, "Learn Python", "in28minutes"), 
				new Course(2, "Learn AWS", "in28minutes"), 
				new Course(3, "Learn java", "rakesh"));
	}
	
	@GetMapping("/add")
	public String addRecord() {
		return "sucess";
	}

}
