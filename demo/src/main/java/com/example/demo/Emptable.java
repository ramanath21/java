package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptable")
public class Emptable {
 String name,address,role,salary;
 @Id
 String id;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getSalary() {
	return salary;
}

public void setSalary(String salary) {
	this.salary = salary;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
 
}
