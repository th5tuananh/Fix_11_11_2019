package com.lhq.postmanagementservice.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lhq.postmanagementservice.model.Post;

@Repository
public interface PostRepository  extends JpaRepository<Post, Long>{
	@Query(value = "SELECT max(post_id) FROM Post" )
	public int max();
}
