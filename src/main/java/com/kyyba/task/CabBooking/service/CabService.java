package com.kyyba.task.CabBooking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyyba.task.CabBooking.domain.Users;
import com.kyyba.task.CabBooking.repository.CabRepository;



@Service
public class CabService {
	@Autowired
		private CabRepository cabRespository;
	public List<Users> getAllCustomerDetails(){
				
				List<Users> use=new ArrayList<>();
				cabRespository.findAll().forEach(use::add);
				return use;
			}
	         /*
			 * public User getAllCustomer(String id) { // TODO Auto-generated method stub
			 * return cabRespository.findById(id).orElse(null); }
			 */

	public void addUserE(Users user) {
			// TODO Auto-generated method stub
		cabRespository.save(user);
			
		}

	public void updateUserE(String id, Users user) {
		// TODO Auto-generated method stub
		cabRespository.save(user);
	}

	public void deleteUserE(String id, Users user) {
		// TODO Auto-generated method stub
		cabRespository.deleteById(id);
		
	}

	}


