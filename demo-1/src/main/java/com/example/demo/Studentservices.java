package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentservices {
@Autowired
	StudentRepo repository;

public List<Student> getAllStudents()
{
	return repository.findAll();
}

public void saveStudents(Student e) 
{
	repository.save(e);
}
public void deleteStudents(String id)
{
repository.deleteById(id);
}
public Optional<Student> getStudents(String id) {
	return repository.findById(id);
	
}


public void updateStudent(Student ee,String id) {
	repository.getById(id);
repository.save(ee);
}



}
