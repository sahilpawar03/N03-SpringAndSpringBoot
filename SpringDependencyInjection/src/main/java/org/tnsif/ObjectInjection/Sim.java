package org.tnsif.ObjectInjection;

public class Sim {
	
	//data members  
	private String simtype;
	private String company;
	
	//setters
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//constructor
	@Override
	public String toString() {
		return "Sim [simtype=" + simtype + ", company=" + company + "]";
	}
	
	
}
