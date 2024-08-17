package com.in28minutes.learn_spring_framework.helloworld;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
// Lunch spring context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
		// configure spring framework - @Configuratio
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);}
	}

}
