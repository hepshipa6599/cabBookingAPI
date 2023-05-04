package com.kyyba.task.CabBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kyyba.task.CabBooking.domain.Users;
import com.kyyba.task.CabBooking.service.CabService;


@RestController
public class CabController {
		
			@Autowired
			private CabService cabser;
			
			@RequestMapping(method=RequestMethod.GET,value="/custmers")
			public List<Users> getCustomerDetails(){
				return cabser.getAllCustomerDetails();
		   
			}
			
			/*
			 * @RequestMapping("/welcome/{id}") public User getUser(@PathVariable String id)
			 * { return cabser.getAllCustomer(id); }
			 */
		@RequestMapping(method=RequestMethod.POST,value="/custmers")
		public void addUser(@RequestBody Users user) {
			cabser.addUserE(user);
		}
		@RequestMapping(method=RequestMethod.PUT,value="/custmers/{id}")
		public void updateUser(@RequestBody Users user,@PathVariable String id) {
			cabser.updateUserE(id,user);
		}
		
		@RequestMapping(method=RequestMethod.DELETE,value="/custmers/{id}")
		public void deleteUser(@RequestBody Users user,@PathVariable String id) {
			cabser.deleteUserE(id,user);
		}
		}





