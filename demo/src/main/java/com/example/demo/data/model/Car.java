package com.example.demo.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Entity is picked up by Hibernate, which will automatically map objects to and from
// json data for us @Entity 
// Specifies that this is a persistable type, i.e. in a databasepublic 

@Entity
public class Car {
//	private static int ID_COUNTER = 0;
	
	@Id // required by any class marked with
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id; // this is the primary key in a MySql DB
	private double engineSize;// litres
	private int mileage;
	private int yearManufactured;
	private String colour;
	private String make;
	private String model;

	public Car() {
	}

	public Car(double engineSize, int mileage, int yearManufactured, String colour, String manufacturer, String model) {
		super();
		// 'this' is referring to the current object being created 
//		this.id = ID_COUNTER++; 
		// only supplying the id here as are not yet using a database
		this.engineSize = engineSize;
		this.mileage = mileage;
		this.yearManufactured = yearManufactured;
		this.colour = colour;
		this.make = manufacturer;
		this.model = model;
	}

	public Car(int id, double engineSize, int mileage, int yearManufactured, String colour, String manufacturer,
			String model) {
		super();
		// 'this' is referring to the current object being created 
		this.id = id;
		this.engineSize = engineSize;
		this.mileage = mileage;
		this.yearManufactured = yearManufactured;
		this.colour = colour;
		this.make = manufacturer;
		this.model = model;
	}

//	public static int getID_COUNTER() {
//		return ID_COUNTER;
//	}
//
//	public static void setID_COUNTER(int iD_COUNTER) {
//		ID_COUNTER = iD_COUNTER;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getYearManufactured() {
		return yearManufactured;
	}

	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String manufacturer) {
		this.make = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}