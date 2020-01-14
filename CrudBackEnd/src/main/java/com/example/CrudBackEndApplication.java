package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.User;
import com.example.reposistory.UserReposistory;

@SpringBootApplication
public class CrudBackEndApplication implements CommandLineRunner {
	@Autowired
	private UserReposistory userReposistory;
	public static void main(String[] args) {
		SpringApplication.run(CrudBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userReposistory.save(new User("Neeraj", "Singh"));
		userReposistory.save(new User("Vimal", "Singh"));
		userReposistory.save(new User("Sudhir", "Singh"));
		userReposistory.save(new User("Vishal", "Singh"));
		userReposistory.save(new User("Sidhant", "Singh"));
		
	}

}
