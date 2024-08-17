package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name , int age) {
}

record Address (String firstLine, String city) {}


@Configuration
public class HelloWorldConfiguration {
	@Bean
    public String name(){
        return "Pratik";
    }
	
	@Bean
    public int age(){
        return 45;
    }
	
	@Bean
	public Person person() {
		var person = new Person("baba" , 25);
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name() , age());
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name,  int age) {
		var person = new Person(name , age);
		return person;
	}
	
	@Bean(name = "address2")
	public Address address() {
		var address = new Address("Baker Street" , "London");
		return address;
	}
	
	@Bean(name = "address3")
	@Primary
	public Address address3() {
		var address = new Address("Baker Street" , "London");
		return address;
	}

}
