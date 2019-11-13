package com.lhq.postmanagementservice.model;

public class House {
	private Long land_id;
	private String user_id;
	private int post_id;
	private String house_level;
	private int floor;
	private int restroom;
	private int bedroom;
	
	public House() {}
	public House(Long land_id, String user_id, int post_id, String house_level, int floor, int restroom, int bedroom) {
		super();
		this.land_id = land_id;
		this.user_id = user_id;
		this.post_id = post_id;
		this.house_level = house_level;
		this.floor = floor;
		this.restroom = restroom;
		this.bedroom = bedroom;
	}
	public Long getLand_id() {
		return land_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public int getPost_id() {
		return post_id;
	}
	public String getHouse_level() {
		return house_level;
	}
	public int getFloor() {
		return floor;
	}
	public int getRestroom() {
		return restroom;
	}
	public int getBedroom() {
		return bedroom;
	}
	public void setLand_id(Long land_id) {
		this.land_id = land_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public void setHouse_level(String house_level) {
		this.house_level = house_level;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public void setRestroom(int restroom) {
		this.restroom = restroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	
	
}
