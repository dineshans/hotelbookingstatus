package com.entity;

public class User {
	
	int userId; 
    String name; 
    int price;
    int bonusPoints;
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBonusPoints() {
		return bonusPoints;
	}
	public void setBonusPoints(int bonusPoints) {
		this.bonusPoints = bonusPoints;
	}
	
	

}
