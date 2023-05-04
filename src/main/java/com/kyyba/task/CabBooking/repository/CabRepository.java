package com.kyyba.task.CabBooking.repository;

import org.springframework.data.repository.CrudRepository;

import com.kyyba.task.CabBooking.domain.Users;



public interface CabRepository extends CrudRepository<Users,String> {

	
	}