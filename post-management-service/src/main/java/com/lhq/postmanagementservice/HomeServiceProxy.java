package com.lhq.postmanagementservice;

import java.util.List;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lhq.postmanagementservice.config.HouseClientConfig;
import com.lhq.postmanagementservice.model.House;
import com.lhq.postmanagementservice.model.Post;
import com.lhq.postmanagementservice.model.PostHouse;
import com.lhq.postmanagementservice.model.PostLand;

@FeignClient(name="house-m-service", url="localhost:8005", configuration = HouseClientConfig.class)
public interface HomeServiceProxy {
	
	@GetMapping("/api/house/{id}")
	public Post getHouse(@PathVariable("id") long id);
	
	@GetMapping("/api/house/post/{id}")
	public House getHousebyPostId(@PathVariable("id") int postId);
	
	@PostMapping("/api/house/")
	House addHouse(@Valid @RequestBody House house); 
}