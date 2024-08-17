package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CoursejdbcRepository {
	@Autowired
	private JdbcTemplate springJdbctemplete;
	private static String INSERT_QUERY ="""
			INSERT INTO course (id, name, author)
			VALUES (?, ?, ?);
			""";
	
	private static String DELETE_QUERY ="""
			DELETE from course where id = ?;
			""";
	public void insert(Course course) {
		 
		springJdbctemplete.update(INSERT_QUERY, course.getId(), course.getName(),course.getAuthor());
	}
	
	public void deleteById(long id) {
		 
		springJdbctemplete.update(DELETE_QUERY, id);
	}
	
}
