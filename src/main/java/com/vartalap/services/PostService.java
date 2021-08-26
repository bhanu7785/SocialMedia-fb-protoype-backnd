package com.vartalap.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vartalap.dao.PostRepo;
import com.vartalap.entity.Post;

@Service
public class PostService {
	
	@Autowired
	private PostRepo postRepo;
	
	public ArrayList<Post> savePost(Post postData){
		Date date=new Date();
		long time=date.getTime();
	    Timestamp datetime=new Timestamp(time);
		
		postData.setActivityStatus("active");
		postData.setLikes(0);
		postData.setDatetime(datetime);
		
	     postRepo.save(postData);
	    ArrayList<Post> allPosts = retrievePost();
		
		return allPosts;
	}
	
	public ArrayList<Post> retrievePost(){
		
		ArrayList<Post> allPosts = (ArrayList<Post>) postRepo.findAll();
		
		return allPosts;
	}
	
	public ArrayList<Post> deletePost(Long postId){
		postRepo.deleteById(postId);
		return retrievePost();
		
	}

}
