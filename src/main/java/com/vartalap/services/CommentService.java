package com.vartalap.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vartalap.dao.CommentRepo;
import com.vartalap.entity.Comment;

@Service
public class CommentService {

	
	@Autowired
	private CommentRepo commentRepo;
	
	public ArrayList<Comment> saveComment(Comment comment){
		Date date=new Date();
		long time=date.getTime();
	    Timestamp datetime=new Timestamp(time);
	    
	    comment.setDatetime(datetime);
		commentRepo.save(comment);
		ArrayList<Comment> allStatus = getAllComments(comment.getPostId());
		return allStatus;
	}
	
	public ArrayList<Comment> getAllComments(Long string){
		ArrayList<Comment> allStatus = (ArrayList<Comment>) commentRepo.findByPostId(string);
		return allStatus;
	}
	




}
