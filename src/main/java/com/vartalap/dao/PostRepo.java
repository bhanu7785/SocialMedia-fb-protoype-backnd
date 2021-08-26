package com.vartalap.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vartalap.entity.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {

}
