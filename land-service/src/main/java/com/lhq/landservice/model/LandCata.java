package com.lhq.landservice.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "lands")
@EntityListeners(AuditingEntityListener.class)
public class LandCata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long land_id;
	private String user_id;
	private String title;
	private int price;
	private String image_url;
	private String catalog;
	private String address;
	
	public LandCata() {
		
	}
	public LandCata(Long land_id, String user_id, String title, int price, String image_url, String catalog,
			String address) {
		super();
		this.land_id = land_id;
		this.user_id = user_id;
		this.title = title;
		this.price = price;
		this.image_url = image_url;
		this.catalog = catalog;
		this.address = address;
	}
	public Long getLand_id() {
		return land_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public String getImage_url() {
		return image_url;
	}
	public String getCatalog() {
		return catalog;
	}
	public String getAddress() {
		return address;
	}
	public void setLand_id(Long land_id) {
		this.land_id = land_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "LandCata [land_id=" + land_id + ", user_id=" + user_id + ", title=" + title + ", price=" + price
				+ ", image_url=" + image_url + ", catalog=" + catalog + ", address=" + address + "]";
	}
	
	
}
