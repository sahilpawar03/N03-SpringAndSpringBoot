package org.tnsif.usingautowiredannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	
	//DI in the form of objects
	private Cell cell;
	
	//DI using setters
	/*To acheive autowiting using setters,use
	@Autowired
	/*when you have created multiple bean then if you want to access 
		*particular one then use @Qualifier annotation*/ 
	@Autowired
	@Qualifier("c2")
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	
	//default constructor
	public Remote() {
		super();
		System.out.println("Default Constructor for remote");
		
		
	}
	
	//injecting the object of cell class
	public void remote() {
		cell.power();
	}
}
