package com.vartalap.controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vartalap.entity.Comment;
import com.vartalap.services.CommentService;

@CrossOrigin
@RestController
@RequestMapping("/api/post/comment")
public class CommentController {
	

	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/save")
	public ArrayList<Comment> saveStatus(@RequestBody Comment statusData){
		return commentService.saveComment(statusData);
	}
	
	
	@GetMapping("/viewAll")
	public ArrayList<Comment> retriveStatus(Long postId){
		return commentService.getAllComments(postId);
		
	}
	
//	/*
//	 * @DeleteMapping("/delete/{commentId}") public ArrayList<Comment>
//	 * deleteStatus(@PathVariable UUID commentId){ return
//	 * commentService.deleteComment(commentId); }
//	 */


}
