package com.example.demo.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.model.Car;

@Repository								  //Entity, Id data type
public interface CarRepo extends JpaRepository<Car, Integer>{
	//create
	//read
	//update
	//delete	
	//		  SELECT * FROM car WHERE colour = ?
	List<Car> findCarByColour(String colour);
	List<Car> findCarByMake(String make);
	List<Car> findCarByModel(String make);
	List<Car> findCarByYearManufactured(int yearManufactured);
}
