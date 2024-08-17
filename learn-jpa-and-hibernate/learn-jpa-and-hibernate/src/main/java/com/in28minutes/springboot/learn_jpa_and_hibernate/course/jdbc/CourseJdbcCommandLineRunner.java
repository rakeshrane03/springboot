package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CoursejdbcRepository repository;
	@Autowired
	CourseSpringDataRepository repository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		repository.save(new Course(1, "Java", "Rakesh"));
//		repository.save(new Course(2, "aws", "Rakesh"));
//		repository.save(new Course(3, "python", "Rakesh"));
//		
////		repository.deleteById(1l);
//		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findByName("Java"));
//		System.out.println(repository.findByAuthor("Rakesh"));
	}
	

}
