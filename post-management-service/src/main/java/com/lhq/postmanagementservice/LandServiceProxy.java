package com.lhq.postmanagementservice;

import java.util.List;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lhq.postmanagementservice.model.Land;
import com.lhq.postmanagementservice.model.Post;
import com.lhq.postmanagementservice.model.PostCata;
import com.lhq.postmanagementservice.model.PostLand;

@FeignClient(name="land-service", url="localhost:8004")
public interface LandServiceProxy {
	
		
		@GetMapping("/api/land/{id}")
		public Post getHouse(@PathVariable("id") long id);
		
		@GetMapping("/api/land")
		public List<PostCata> getallLand();
		
		@PostMapping("/api/land/")
		Land addLand(@Valid @RequestBody Land land);
		
		@GetMapping("/api/land/post/{id}")
		public Land getLandbyPostId(@PathVariable("id") int postId);
	
}
