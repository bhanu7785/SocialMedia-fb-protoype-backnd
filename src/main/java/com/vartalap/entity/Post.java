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
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long postId;
	private String userId;
	private String userName;
	private String userImageURL;
	private String activityStatus;
	private String description;
	private String postImageURL;
	
	private int likes;
	private Timestamp datetime;
	
	


	public Post(Long postId, String userId, String userName, String userImageURL, String activityStatus, String description,
			String postImageURL, int likes, Timestamp datetime) {
		super();
		this.postId = postId;
		this.userId = userId;
		this.userName = userName;
		this.userImageURL = userImageURL;
		this.activityStatus = activityStatus;
		this.description = description;
		this.postImageURL = postImageURL;
		this.likes = likes;
		this.datetime = datetime;
	}
	


	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserImageURL() {
		return userImageURL;
	}


	public void setUserImageURL(String userImageURL) {
		this.userImageURL = userImageURL;
	}


	public String getActivityStatus() {
		return activityStatus;
	}


	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}


	public String getPostImageURL() {
		return postImageURL;
	}


	public void setPostImageURL(String postImageURL) {
		this.postImageURL = postImageURL;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}


	public Timestamp getDatetime() {
		return datetime;
	}


	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}
	
	
	
	

}
