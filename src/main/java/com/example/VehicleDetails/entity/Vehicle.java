package com.example.VehicleDetails.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehicles")
public class Vehicle {

	    @Id
	    private String id;
	    private String vin;
	    private String make;
	    private String model;
	    private int year;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getVin() {
			return vin;
		}
		public void setVin(String vin) {
			this.vin = vin;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public Vehicle(String id, String vin, String make, String model, int year) {
			super();
			this.id = id;
			this.vin = vin;
			this.make = make;
			this.model = model;
			this.year = year;
		}
		public Vehicle() {
			
		}
		@Override
		public String toString() {
			return "Vehicle [id=" + id + ", vin=" + vin + ", make=" + make + ", model=" + model + ", year=" + year
					+ "]";
		}

	  
}
