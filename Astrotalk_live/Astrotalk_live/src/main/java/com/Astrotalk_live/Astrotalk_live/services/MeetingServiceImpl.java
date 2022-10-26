package com.springrest.springrest.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Meeting;
@Service
public class MeetingServiceImpl implements MeetingService {
	
	List<Meeting> list;
	public MeetingServiceImpl() {
		 list = new ArrayList<>();
		 list.add(new Meeting("Astrotalk_live_1","Astrotalk","live_feedback","collecting the raw data for bussiness improvement",100,1));
		 list.add(new Meeting("Astrotalk_live_2","Codeyeti software solutions","feedback_part_2","to get information about what the user wanted to be",160,2));
	}
	
	@Override
	public List<Meeting> meetingdetails() {
		
		return list;
	}

}
