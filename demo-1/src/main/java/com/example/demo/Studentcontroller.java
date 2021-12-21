package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Studentcontroller {
@Autowired
	Studentservices services;

@GetMapping("/getstudent")
public List<Student>  getAllStudents()
{
	return services.getAllStudents();
}

@PostMapping("/student")
public void saveStudents(@RequestBody Student e) 
{
	services.saveStudents(e);
}
@PostMapping("/deleteuse/{id}")
public void deleteStudents(@PathVariable String id)
{
services.deleteStudents(id);
}
@GetMapping("/getstu/{id}")
public Optional<Student> getStudents(@PathVariable String id) {
	return services.getStudents(id);
}


@PostMapping("/update/{id}")
public void updateStudents(@PathVariable String id, @RequestBody Student ee) {
	services.updateStudent(ee, id);
}
}
