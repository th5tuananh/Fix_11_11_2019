package com.lhq.housemservice.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "houses")
@EntityListeners(AuditingEntityListener.class)
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long house_id;
	private String user_id;
	private int post_id;
	private String house_level;
	private int floor;
	private int restroom;
	private int bedroom;
	
	
	public House() {
		
	}
	public House(Long house_id, String user_id, int post_id, String house_level, int floor, int restroom, int bedroom) {
		super();
		this.house_id = house_id;
		this.user_id = user_id;
		this.post_id = post_id;
		this.house_level = house_level;
		this.restroom = restroom;
		this.bedroom = bedroom;
		this.floor = floor;
	}

	public Long getLand_id() {
		return house_id;
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

	public int getRestroom() {
		return restroom;
	}

	public int getBedroom() {
		return bedroom;
	}

	public int getFloor() {
		return floor;
	}

	public void setHouse_id(Long land_id) {
		this.house_id = land_id;
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

	public void setRestroom(int restroom) {
		this.restroom = restroom;
	}

	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	
	
	
}
