package org.tnsif.autowiredexample;

public class Parent {
	
	//DI in the form of objects
	Children c;
	
	//DI using setters
	public void setc(Children c) {
		this.c=c;
	}
	
	public void accept()
	{
		Children c;
	}
	
}
