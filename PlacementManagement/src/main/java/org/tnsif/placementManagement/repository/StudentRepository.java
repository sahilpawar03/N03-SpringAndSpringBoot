package org.tnsif.placementManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementManagement.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
				
}
