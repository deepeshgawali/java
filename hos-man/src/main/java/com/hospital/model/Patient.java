package com.hospital.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
private 	Long id;
private String name;
private String contactnumber;
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactnumber() {
	return contactnumber;
}
public void setContactnumber(String contactnumber) {
	this.contactnumber = contactnumber;
}

}
