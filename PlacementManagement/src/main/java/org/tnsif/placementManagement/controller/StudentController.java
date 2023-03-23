package org.tnsif.placementManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementManagement.entities.Student;
@RestController
public class StudentController<StudentService> {
	
	@Autowired
	private List<Student> service;
	
	
	//Restful API For CRUD operation
	@GetMapping("/students")
	public List<Student>listAll()
	{
			
		 return service.retrieveAll(null);
	}
	public ResponseEntity<Student>get(@PathVariable Integer id)
	{
		try {
			Student student=service.retrieve(id);
			return new  ResponseEntity<Student>(student,HttpStatus.OK);
		}
		service.remove(null);
	}
	
	@DeleteMapping("/students/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//to insert a data
	@PostMapping
	public void insert(@RequestBody Student student)
	{
		service.add(student);
	}
	
	public ResponseEntity<?>update(@RequestBody Student student, @PathVariable Integer id)
	{
		try {
			Student s1=service.retrieve(id);
			service.add(student);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return null;
	}
}
