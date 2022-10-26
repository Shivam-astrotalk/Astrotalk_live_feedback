package com.springrest.springrest.entities;

import java.sql.Time;
import java.util.Date;

public class Meeting {
	private String Meeting_name;
	private String Organizer;
	private String description;
	private String meetingnotes;

	
	private long Number_of_participants;
	private long Meeting_ID;
	
	
	
	
	@Override
	public String toString() {
		return "Meeting [Meeting_name=" + Meeting_name + ", Organizer=" + Organizer + ", description=" + description
				+ ", meetingnotes=" + meetingnotes +   
				  ", Number_of_participants="
				+ Number_of_participants + ", Meeting_ID=" + Meeting_ID + ",]";
	}



	public String getMeeting_name() {
		return Meeting_name;
	}



	public void setMeeting_name(String meeting_name) {
		Meeting_name = meeting_name;
	}



	public String getOrganizer() {
		return Organizer;
	}



	public void setOrganizer(String organizer) {
		Organizer = organizer;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getMeetingnotes() {
		return meetingnotes;
	}



	public void setMeetingnotes(String meetingnotes) {
		this.meetingnotes = meetingnotes;
	}







	


	



	


	public long getNumber_of_participants() {
		return Number_of_participants;
	}



	public void setNumber_of_participants(long number_of_participants) {
		Number_of_participants = number_of_participants;
	}



	public long getMeeting_ID() {
		return Meeting_ID;
	}



	public void setMeeting_ID(long meeting_ID) {
		Meeting_ID = meeting_ID;
	}



	




	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Meeting(String meeting_name, String organizer, String description, String meetingnotes, long number_of_participants, long meeting_ID) {
		super();
		Meeting_name = meeting_name;
		Organizer = organizer;
		this.description = description;
		this.meetingnotes = meetingnotes;
		
	
		Number_of_participants = number_of_participants;
		Meeting_ID = meeting_ID;
	}

}
