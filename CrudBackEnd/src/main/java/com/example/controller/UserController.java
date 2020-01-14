package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.reposistory.UserReposistory;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserReposistory userReposistory;
	
	@GetMapping("/users")
	public List<User> getUsers(){
	return userReposistory.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
	//return userReposistory.findOne(id);
	Optional<User> user = this.userReposistory.findById(id);
	if (user.isPresent()) {
	    return  user.get();
	} else {
	    return null;
	}
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		userReposistory.deleteById(id);
		return true;
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user){
	return userReposistory.save(user);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user){
	return userReposistory.save(user);
	}
	

}
