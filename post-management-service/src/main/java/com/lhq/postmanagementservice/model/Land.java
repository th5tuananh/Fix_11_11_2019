package com.lhq.postmanagementservice.model;

public class Land {
	private Long land_id;
	private String user_id;
	private int post_id;
	private String facade_area;
	
	public Land() {
		
	}
	

	public Land(Long land_id, String user_id, int post_id, String facade_area) {
		super();
		this.land_id = land_id;
		this.user_id = user_id;
		this.post_id = post_id;
		this.facade_area = facade_area;
	}





	public Long getLand_id() {
		return land_id;
	}





	public void setLand_id(Long land_id) {
		this.land_id = land_id;
	}





	public String getUser_id() {
		return user_id;
	}

	public int getPost_id() {
		return post_id;
	}

	public String getFacade_area() {
		return facade_area;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public void setFacade_area(String facade_area) {
		this.facade_area = facade_area;
	}
	
	
}
