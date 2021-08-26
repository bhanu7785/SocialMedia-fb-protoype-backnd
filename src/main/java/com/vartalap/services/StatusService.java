package com.vartalap.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vartalap.dao.StatusRepo;
import com.vartalap.entity.Status;

@Service
public class StatusService {
	
	@Autowired
	private StatusRepo statusRepo;
	
	public ArrayList<Status> saveSatus(Status status){
		Date date=new Date();
		long time=date.getTime();
	    Timestamp datetime=new Timestamp(time);
	    
	    status.setDatetime(datetime);
	    
		statusRepo.save(status);
		ArrayList<Status> allStatus = getAllStatus();
		return allStatus;
	}
	
	public ArrayList<Status> getAllStatus(){
		ArrayList<Status> allStatus = (ArrayList<Status>) statusRepo.findAll();
		return allStatus;
	}
	
	public ArrayList<Status> deleteStatus(Long statusId){
		statusRepo.deleteById(statusId);
		 return getAllStatus();
	}

}
