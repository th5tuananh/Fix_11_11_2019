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
public class PostCata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long post_id;
		private String user_id;
		private String title;
		private int price;
		private String image_url;
		private String catalog;
		private String address;
		
		public PostCata() {}
		
		public PostCata(Long post_id, String user_id, String title, int price, String image_url, String catalog,
				String address) {
			super();
			this.post_id = post_id;
			this.user_id = user_id;
			this.title = title;
			this.price = price;
			this.image_url = image_url;
			this.catalog = catalog;
			this.address = address;
		}
		public Long getPost_id() {
			return post_id;
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
		public void setPost_id(Long post_id) {
			this.post_id = post_id;
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
}
