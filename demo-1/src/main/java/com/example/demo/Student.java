package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stud")
public class Student {
String name,clas,address,marks;
@Id
String id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClas() {
	return clas;
}
public void setClas(String clas) {
	this.clas = clas;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks= marks;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}



}
