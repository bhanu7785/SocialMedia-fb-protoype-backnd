package com.vartalap.entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long commentId;
	
	private Long postId;
	private String userId;
	private String comment;
	
	private Timestamp datetime;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(Long commentId, Long postId, String userId, String comment, Timestamp datetime) {
		super();
		this.commentId = commentId;
		this.postId = postId;
		this.userId = userId;
		this.comment = comment;
		this.datetime = datetime;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getDatetime() {
		return datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}
	
	

}
