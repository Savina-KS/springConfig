package com.training.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.user.model.User;

@Repository
public interface userInterface extends JpaRepository<User, Integer>{
	
}
