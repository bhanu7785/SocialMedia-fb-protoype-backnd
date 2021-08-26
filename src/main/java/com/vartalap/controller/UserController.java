package com.vartalap.controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vartalap.entity.User;
import com.vartalap.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {
	

	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/save")
	public User savePost(@RequestBody User userData){
		User saveUser = userService.saveMetaDataOfUser(userData);
		
		return saveUser;
	}
	
	@GetMapping("/viewAllDetails")
	public ArrayList<User> retrivePost(User user){
		ArrayList<User> retrieveUser = userService.retrieveAllUserDetails();	
		return retrieveUser;
	}
	
	@GetMapping("/user/{userId}")
	public User getUserData(@PathVariable String userId){
		return userService.getUserData(userId);
	}


	


}
