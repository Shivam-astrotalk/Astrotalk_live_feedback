package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Meeting;
import com.springrest.springrest.services.MeetingService;


@RestController
public class MyController {
	
	
	@Autowired
	private MeetingService meetingService;
	
	@GetMapping("/home")
	public String meeting() {
		return "welcome to the Live event of Astrotalk ";
	}
	
	//get the meeting details
	@GetMapping("/meeting")
	public List<Meeting> meetingdetails(){
		return this.meetingService.meetingdetails();
		
	}
	
	/*@GetMapping("/meeting/{meetId}")
	public meet getmeet;{
		return this.meetingService.getmeet(meetId);
		
	}
*/
}
