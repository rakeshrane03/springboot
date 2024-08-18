package com.in28minute.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {
	
	@RequestMapping("/say_hello")
	@ResponseBody
	public String sayHello(){
		return "Welcome  to my first website";
	}

	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml(){
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My web page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Welcome  to my first website html");
		sb.append(" </body>");
		sb.append("<html>");
		return sb.toString();
	}
	
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJSP(){
		return "sayHello";
	}


}
