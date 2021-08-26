package com.vartalap.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vartalap.entity.User;

public interface UserRepo extends JpaRepository<User, String> {

}
