package com.lhq.housemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lhq.housemservice.model.House;


@Repository
public interface HouseRepository extends JpaRepository<House, Long>{
	
	@Query(value = "SELECT u FROM House u WHERE u.post_id = :post_id")
	public House findByPostId(@Param("post_id") int postId);
	
}
