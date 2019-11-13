package com.lhq.postmanagementservice.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "posts")
@EntityListeners(AuditingEntityListener.class)
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long post_id;
	private String user_id;
	private String catalog;
	private String title;
	private String content;
	private int price;
	private int area;
	private String image_url;
	private String city;
	private String district;
	private String address;
	private String location;
	private String certification;
	private String direction;
	private int rating;
	private String status;
	
	public Post() {}

	public Post(Long post_id, String user_id, String catalog, String title, String content, int price, int area,
			String image_url, String city, String district, String address, String location, String certification,
			String direction, int rating) {
		super();
		this.post_id = post_id;
		this.user_id = user_id;
		this.catalog = catalog;
		this.title = title;
		this.content = content;
		this.price = price;
		this.area = area;
		this.image_url = image_url;
		this.city = city;
		this.district = district;
		this.address = address;
		this.location = location;
		this.certification = certification;
		this.direction = direction;
		this.rating = rating;
	}

	public Long getPost_id() {
		return post_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getCatalog() {
		return catalog;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getPrice() {
		return price;
	}

	public int getArea() {
		return area;
	}

	public String getImage_url() {
		return image_url;
	}

	public String getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public String getAddress() {
		return address;
	}

	public String getLocation() {
		return location;
	}

	public String getCertification() {
		return certification;
	}

	public String getDirection() {
		return direction;
	}

	public int getRating() {
		return rating;
	}

	public void setPost_id(Long post_id) {
		this.post_id = post_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
