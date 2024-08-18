package com.in28minute.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {
	private ToDoService todoService;
	
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}


	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<ToDo> todos = todoService.findByUserName("in28minutes");
		model.addAttribute("todos", todos);
		return "listTodos";
	}

}
