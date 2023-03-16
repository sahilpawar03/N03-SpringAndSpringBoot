package org.tnsif.ObjectInjection;

public class Charger {
	
		//private data members;
		private String brand;
		private int voltage;
		private String type;
		
		//DI using setters
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public void setVoltage(int voltage) {
			this.voltage = voltage;
		}
		public void setType(String type) {
			this.type = type;
		}
		public void power()
		{
			System.out.println("Details realated");
			System.out.println("Charger brand=" + brand + ", voltage=" + voltage + ", type=" + type);
		}
		
		
		
}
