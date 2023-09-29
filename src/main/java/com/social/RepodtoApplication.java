package com.social;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.social.entities.User;
import com.social.repositories.UserRepository;

@SpringBootApplication
public class RepodtoApplication implements CommandLineRunner {

	@Autowired
	// dependency injection
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RepodtoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User us1=new User(0,"test","test", 20, "not found");
		User us2=new User(0,"test2","test2", 40, "Tunisia");
		//userRepository.save(us1);
		//userRepository.save(us2);
		userRepository.findAll().forEach(us->
		{
			System.out.println(us.toString());
		}
				);
		
		
		
		
	}

}
