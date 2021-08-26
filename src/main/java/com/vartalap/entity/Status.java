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

public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long statusId;
	
	private String userId;
	private String statusImgURL;
	
	private Timestamp datetime;

	public Status(Long statusId, String userId, String statusImgURL, Timestamp datetime) {
		super();
		this.statusId = statusId;
		this.userId = userId;
		this.statusImgURL = statusImgURL;
		this.datetime = datetime;
	}

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatusImgURL() {
		return statusImgURL;
	}

	public void setStatusImgURL(String statusImgURL) {
		this.statusImgURL = statusImgURL;
	}

	public Timestamp getDatetime() {
		return datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}
	
	
	

}
