package com.vartalap.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vartalap.dao.UserRepo;
import com.vartalap.entity.User;

@Service
public class UserService {

	
	@Autowired
	private UserRepo userRepo;
	
	public User saveMetaDataOfUser(User user){
		Date date=new Date();
		long time=date.getTime();
	    Timestamp datetime=new Timestamp(time);
		
	    user.setActive(true);
	    user.setJoinedDate(datetime);
		
		User saveUser = userRepo.save(user);
		
		return saveUser;
	}
	
	public ArrayList<User> retrieveAllUserDetails(){
		
		ArrayList<User> allPosts = (ArrayList<User>) userRepo.findAll();
		
		return allPosts;
	}
	
	public User getUserData(String userId) {
		return userRepo.getById(userId);
	}
	




}
