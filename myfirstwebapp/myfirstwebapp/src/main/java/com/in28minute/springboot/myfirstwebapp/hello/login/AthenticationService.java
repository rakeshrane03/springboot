package com.in28minute.springboot.myfirstwebapp.hello.login;

import org.springframework.stereotype.Service;

@Service
public class AthenticationService {
 public boolean authenticate(String username, String password) {
	 boolean isvalidUsername = username.equalsIgnoreCase("Rakesh");
	 boolean isValidPassword = password.equalsIgnoreCase("dummy");
	 return isvalidUsername && isValidPassword;
 }
}
