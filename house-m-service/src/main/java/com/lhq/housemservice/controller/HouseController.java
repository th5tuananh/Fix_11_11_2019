package com.lhq.housemservice.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhq.housemservice.exception.ResourceNotFoundException;
import com.lhq.housemservice.model.House;
import com.lhq.housemservice.repository.HouseRepository;



@RestController
@RequestMapping("/api")
public class HouseController {
	
	@Autowired
	HouseRepository houseRepo;

	
	@GetMapping("/house/{id}")
	public House getLand(@PathVariable("id") long landId){

		return houseRepo.findById(landId).orElseThrow(() -> new ResourceNotFoundException("House", "id", landId));
	}
	
	@GetMapping("/house/post/{id}")
	public House getHousebyPostId(@PathVariable("id") int postId) {
		return houseRepo.findByPostId(postId);
	}
	
	
	
	@PostMapping("/house/")
	public House addHouse(@Valid @RequestBody House home) {
		return houseRepo.save(home);
	}
	
}
