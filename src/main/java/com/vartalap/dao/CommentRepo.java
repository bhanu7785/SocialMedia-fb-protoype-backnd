package com.vartalap.dao;


import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vartalap.entity.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {
	
	public List<Comment> findByPostId(Long postId);
	

}
