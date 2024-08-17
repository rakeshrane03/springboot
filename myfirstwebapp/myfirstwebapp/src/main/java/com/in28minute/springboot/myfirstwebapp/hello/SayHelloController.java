package com.in28minute.springboot.myfirstwebapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
	
	@RequestMapping("/say_hello")
	public String sayHello(){
		return "Welcome  to my first website";
	}

}
