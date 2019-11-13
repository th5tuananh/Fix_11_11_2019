package com.lhq.housemservice.configuration;

import org.springframework.context.annotation.Configuration;

import com.lhq.housemservice.model.House;


@Configuration
public class HouseConfig {
	public House house() {
		return new House();
	
}
}
