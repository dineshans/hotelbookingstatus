package com.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseEntity{
	
	public int id;
	public String name;
	public String roomStatus;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	
	

}
