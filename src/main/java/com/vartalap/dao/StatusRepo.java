package com.vartalap.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vartalap.entity.Status;

public interface StatusRepo extends JpaRepository<Status,Long> {

}
