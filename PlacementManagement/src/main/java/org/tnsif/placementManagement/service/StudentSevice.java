package org.tnsif.placementManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementManagement.entities.Student;
import org.tnsif.placementManagement.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentSevice {
	
	@Autowired
	private StudentRepository repo;
	
	
	//addition/creation/insertion
	void add(Student student) 
	{
		repo.save(student);
	}
	
	//retrieve with specific id
	public void retrieve (Integer id) {
		repo.findById(id).get();
	}
	
	//delete 
	void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	//to retrieve all the records
	 public List<Student>retrieveAll()
	{
		return repo.findAll();
	}
	
}
