package com.doctor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Doctor {
	@Id
private int id;
private String name;
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
