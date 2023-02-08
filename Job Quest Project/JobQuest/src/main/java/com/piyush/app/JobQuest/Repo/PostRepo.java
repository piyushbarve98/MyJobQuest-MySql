package com.piyush.app.JobQuest.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.piyush.app.JobQuest.Models.Post;

public interface PostRepo extends JpaRepository<Post, Long>{
    
    @Query("SELECT u FROM Post u WHERE u.profile LIKE %:keyword% OR u.exp LIKE %:keyword% OR u.description LIKE %:keyword% OR u.techs LIKE %:keyword%")
    List<Post> findUsersByName(@Param("keyword") String name);
}
