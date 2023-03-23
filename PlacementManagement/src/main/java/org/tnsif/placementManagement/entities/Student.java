package org.tnsif.placementManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
			@Id
			private Integer id;
			private String name;
			private Integer roll;
			private String qualification;
			private String course;
			private Integer year;
			private Integer halltickectsno;
			
			public Student() {
				super();
				
			}
			@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
						+ ", course=" + course + ", year=" + year + ", halltickectsno=" + halltickectsno + "]";
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
			public int getRoll() {
				return roll;
			}
			public void setRoll(int roll) {
				this.roll = roll;
			}
			public String getQualification() {
				return qualification;
			}
			public void setQualification(String qualification) {
				this.qualification = qualification;
			}
			public String getCourse() {
				return course;
			}
			public void setCourse(String course) {
				this.course = course;
			}
			public int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
			}
			public int getHalltickectsno() {
				return halltickectsno;
			}
			public void setHalltickectsno(int halltickectsno) {
				this.halltickectsno = halltickectsno;
			}
			
			
}
