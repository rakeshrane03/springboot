package com.in28minute.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	private static List<ToDo> todos = new ArrayList<>();
	static {
		todos.add(new ToDo(1, "in28Minute", "Learn aws", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(2, "in28Minute", "Learn java", LocalDate.now().plusMonths(6), false));
		todos.add(new ToDo(3, "in28Minute", "Learn html", LocalDate.now().plusMonths(10), false));
	}
	
	public List<ToDo> findByUserName(String username){
		return todos;
	}

}
