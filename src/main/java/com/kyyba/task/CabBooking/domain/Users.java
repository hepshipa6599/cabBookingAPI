package com.kyyba.task.CabBooking.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
		@Id
		@Column(name="custmer id")
		private String id;
		@Column(name="customer name")
		private String name;
		@Column(name="customer location")
		private String location;
		
		public Users() {}
		
		public Users(String id, String name, String location) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		

	}



