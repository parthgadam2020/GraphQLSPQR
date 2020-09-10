package com.example.spqr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spqr.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	public List<User> findAllByOrderByNameAsc();
	
	public List<User> findAllByOrderByAgeAsc();
	
	public List<User> findAllByOrderBySalaryAsc();
}
