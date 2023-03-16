package org.tnsif.ObjectInjection;

public class Cellphone {
	
	//2.DI Using form of objects
	Charger charger;
	
	
	
	public void setCharger(Charger charger) {
		this.charger = charger;
	}



	public void accept() 
	
	{
		charger.power();
	}
	
	
}
