package com.jdbc1;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeOperation {
JdbcTemplate jdbcTemplate;



//public JdbcTemplate getJdbcTemplate() {
//	return jdbcTemplate;
//}



public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}



int insert(Emptable emp) {
	String name=emp.getName();
	String address=emp.getAddress();
	String role=emp.getRole();
	String salary=emp.getSalary();
	String id=emp.getId();
	String query="insert into Emptable values('"+name+"','"+address+"','"+role+"','"+salary+"','"+id+"')";
	int result=jdbcTemplate.update(query);
	
	return result;
	
}
}
