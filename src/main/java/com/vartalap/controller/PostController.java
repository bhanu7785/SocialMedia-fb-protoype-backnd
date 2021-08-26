package com.vartalap.controller;



import java.util.ArrayList;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vartalap.entity.Post;
import com.vartalap.services.PostService;


@CrossOrigin
@RestController
@RequestMapping("/api/post")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	
	@PostMapping("/save")
	public ArrayList<Post> savePost(@RequestBody Post postData){
		ArrayList<Post> savePost = postService.savePost(postData);
		
		return savePost;
	}
	
	@GetMapping("/viewAll")
	public ArrayList<Post> retrivePost(Post post){
		
		ArrayList<Post> retrievePost = postService.retrievePost();
		
		return retrievePost;
	}
	
	@DeleteMapping("/delete/{postId}")
	public ArrayList<Post> deletePost(@PathVariable Long postId){
		
		return postService.deletePost(postId);
	}

}
