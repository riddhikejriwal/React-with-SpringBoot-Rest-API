package com.riddhi.reactexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.riddhi.reactexample.model.User;
import com.riddhi.reactexample.repository.UserRepository;

@SpringBootApplication
public class ReactexampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactexampleApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Riddhi", "Kejriwal", "kejriwal.riddhi551@gmail.com"));
		this.userRepository.save(new User("Varun", "Kumar", "varun@gmail.com"));
		this.userRepository.save(new User("Pragati", "Sharma", "sharma.pragtae@gmail.com"));
		this.userRepository.save(new User("Vinita", "Kejriwal", "kejriwal.vinita@gmail.com"));
	}

}
