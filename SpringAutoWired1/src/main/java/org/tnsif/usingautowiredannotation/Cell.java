package org.tnsif.usingautowiredannotation;

public class Cell {
	
	//private data member
	private String company;
	private String size;
	
	
	//getters and setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	//default constructor
	public Cell() {
		super();
		System.out.println("Default constructor foe cell");
	}
	
	
	public void power()
	{
		System.out.println("Company of a cell:" +company);
		System.out.println("Size of cell:"+size);
	}
}
