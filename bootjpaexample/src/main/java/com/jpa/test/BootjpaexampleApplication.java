package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.user;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		user user=new user();
		user.setName("Shubham Vhadgar");
		user.setCity("Paregaon");
		user.setStatus("I am a java programmer");
		
		user user1=userRepository.save(user);
		System.out.println(user1);
		 
	}

}
