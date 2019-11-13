package com.lhq.postmanagementservice.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhq.postmanagementservice.exception.ResourceNotFoundException;
import com.lhq.postmanagementservice.HomeServiceProxy;
import com.lhq.postmanagementservice.LandServiceProxy;
import com.lhq.postmanagementservice.model.FullPost;
import com.lhq.postmanagementservice.model.House;
import com.lhq.postmanagementservice.model.Land;
import com.lhq.postmanagementservice.model.Post;
import com.lhq.postmanagementservice.model.PostCata;
import com.lhq.postmanagementservice.model.PostHouse;
import com.lhq.postmanagementservice.model.PostLand;
import com.lhq.postmanagementservice.model.PostPost;
import com.lhq.postmanagementservice.repository.PostCataRepository;
import com.lhq.postmanagementservice.repository.PostPostRepository;
import com.lhq.postmanagementservice.repository.PostRepository;


@RestController
public class PostManagementController {
	
	
	@Autowired PostCataRepository postCataRepo;
	
	@Autowired HomeServiceProxy homeProxy;
	
	@Autowired LandServiceProxy landProxy;
	
	@Autowired PostRepository postRepo;
	
	@Autowired PostPostRepository postpRepo;
	
	@GetMapping("/hello")
	public String hello() {
		String hello = "hello";
		return hello;
	}
	
	@GetMapping("/post")
	public List<PostCata> getAll(){
		return postCataRepo.findAll();
	}
	@GetMapping("/personal/post/{id}")
	public List<PostCata> getPesonalPost(@PathVariable("id") String userId){
		return postCataRepo.findByUserId(userId);
	}
	
	@GetMapping("/post/{id}")
	public FullPost getFullPost(@PathVariable("id") Long id){
		Post post = postRepo.findById(id).get();
		Long getPostId = post.getPost_id();
		int postId = getPostId.intValue();
		String cata = post.getCatalog();
		String landCata = "land";
		String houseCata = "house";
		Land reponsel = landProxy.getLandbyPostId(postId);
		House reponseh = homeProxy.getHousebyPostId(postId);
		if(cata.equals(landCata)) {
		
		return new FullPost(post.getPost_id(),
				post.getUser_id(),
				post.getCatalog(),
				post.getTitle(),
				post.getContent(),
				post.getPrice(),
				post.getArea(),
				post.getImage_url(),
				post.getCity(),
				post.getDistrict(),
				post.getAddress(),
				post.getLocation(),
				post.getCertification(),
				post.getDirection(),
				post.getRating(),
				" ",
				(int) 0,
				(int) 0,
				(int) 0,
				reponsel.getFacade_area());
		}
		if (cata.equals(houseCata)){ 
			
			return new FullPost(post.getPost_id(),
					post.getUser_id(),
					post.getCatalog(),
					post.getTitle(),
					post.getContent(),
					post.getPrice(),
					post.getArea(),
					post.getImage_url(),
					post.getCity(),
					post.getDistrict(),
					post.getAddress(),
					post.getLocation(),
					post.getCertification(),
					post.getDirection(),
					post.getRating(),
					reponseh.getHouse_level(),
					reponseh.getFloor(),
					reponseh.getRestroom(),
					reponseh.getBedroom(),
					" ");
			}
		else return new FullPost();
		
		
	}
	/*@PostMapping("/post/")
	public Post addNewPost(@RequestBody Post post) {
		Post exchange = homeServiceProxy.addHouse(post);
		return exchange;
	}*/
	@PostMapping("/post/land/")
	public Post addNewLandPost(@RequestBody PostLand post) {
		int max = postRepo.max();
		int val = max+1;
		//String cata = post.getCatalog();
		//if(cata != null && cata == "land") {
			Land land = new Land((long ) 0 ,post.getUser_id(), val, post.getFacade_area());
			landProxy.addLand(land);
		//}
		Post postbody = new Post((long) val,post.getUser_id(),
				post.getCatalog(),
				post.getTitle(),
				post.getContent(),
				post.getPrice(),
				post.getArea(),
				post.getImage_url(),
				post.getCity(),
				post.getDistrict(),
				post.getAddress(),
				post.getLocation(),
				post.getCertification(),
				post.getDirection(),
				post.getRating());
		return postRepo.save(postbody);
			
	}
	@CrossOrigin("http://localhost:8100")
	@PostMapping("/post/house/")
	public Post addNewHousePost(@RequestBody PostHouse post) {
		int max = postRepo.max();
		int val = max+1;
		//String cata = post.getCatalog();
		//if(cata != null && cata == "land") {
			House house = new House((long ) 0 ,post.getUser_id(), val, post.getHouse_level(),post.getFloor(), post.getBedroom(), post.getRestroom());
			homeProxy.addHouse(house);
		//}
		Post postbody = new Post((long) val,post.getUser_id(),
				post.getCatalog(),
				post.getTitle(),
				post.getContent(),
				post.getPrice(),
				post.getArea(),
				post.getImage_url(),
				post.getCity(),
				post.getDistrict(),
				post.getAddress(),
				post.getLocation(),
				post.getCertification(),
				post.getDirection(),
				post.getRating());
		return postRepo.save(postbody);
			
	}
	
	@PutMapping("/admin/post/{id}")
	public Post editPost(@PathVariable("id") Long id, @Valid @RequestBody Post post){
		
		return postRepo.save(post);
	}
}

