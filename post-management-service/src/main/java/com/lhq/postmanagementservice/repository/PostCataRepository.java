package com.lhq.postmanagementservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.lhq.postmanagementservice.model.PostCata;


@Repository
public interface PostCataRepository  extends JpaRepository<PostCata, Long>{
	@Query(value = "SELECT u FROM PostCata u WHERE u.user_id = :user_id")
	public List<PostCata> findByUserId(@Param("user_id") String userId);
}
