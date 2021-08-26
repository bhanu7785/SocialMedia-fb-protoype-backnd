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

import com.vartalap.entity.Status;
import com.vartalap.services.StatusService;

@CrossOrigin
@RestController
@RequestMapping("/api/status")
public class StatusController {
	
	@Autowired
	private StatusService statusService;
	
	@PostMapping("/save")
	public ArrayList<Status> saveStatus(@RequestBody Status statusData){
		return statusService.saveSatus(statusData);
	}	
	
	@GetMapping("/viewAll")
	public ArrayList<Status> retriveStatus(){
		return statusService.getAllStatus();
		
	}
	
	@DeleteMapping("/delete/{statusId}")
	public ArrayList<Status> deleteStatus(@PathVariable Long stausId){
		return statusService.deleteStatus(stausId);
	}

}
