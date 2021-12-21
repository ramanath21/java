package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Empseriveces {
	@Autowired
	EmpRepo repository;

	

	public List<Emptable> getAllEmployees()
	{
		return repository.findAll();
	}
	
	public void saveEmployee(Emptable e) 
	{
		repository.save(e);
	}
	public void deleteEmployeee(String id)
	{
	repository.deleteById(id);
	}
}
