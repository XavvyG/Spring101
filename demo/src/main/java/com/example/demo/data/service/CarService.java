package com.example.demo.data.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.data.model.Car;
import com.example.demo.data.repository.CarRepo;

@Service
public class CarService {

	private CarRepo repo;
//	private List<Car> carList = new ArrayList<>();

	public CarService(CarRepo repo) {
		this.repo = repo;
	}

	// read all method
	public List<Car> getAllCars() {
		// SELECT * FROM car;
		return this.repo.findAll();
	}
	
	//read by id
	public Car getCar(Integer id) {
		//find car
		Optional<Car> carToFind = this.repo.findById(id);
		Car getThisCar = carToFind.get();
		return getThisCar;
	}

	public List<Car> getCarByColour(String colour) {
		return this.repo.findCarByColour(colour);
	}

	public List<Car> getCarByMake(String make) {
		return this.repo.findCarByMake(make);
	}

	public List<Car> getCarByModel(String model) {
		return this.repo.findCarByModel(model);
	}

	public List<Car> getCarByYearManufactured(Integer year) {
		return this.repo.findCarByYearManufactured(year);
	}
	
	// update method
	public Car updateCar(Car car, Integer id) {
		// find the car to update
		Optional<Car> carToFind = this.repo.findById(id);
		Car carToUpdate = carToFind.get();

		// set that car with new values
		carToUpdate.setColour(car.getColour());
		carToUpdate.setEngineSize(car.getEngineSize());
		carToUpdate.setMake(car.getMake());
		carToUpdate.setMileage(car.getMileage());
		carToUpdate.setModel(car.getModel());
		carToUpdate.setYearManufactured(car.getYearManufactured());

		// save updated car
		return this.repo.save(carToUpdate);
	}

	// add method
	public Car addCar(Car car) {
		// Add new Car and return it
		return this.repo.save(car);
	}

	// delete method
	public boolean removeCar(Integer id) {
		// Remove Car
		this.repo.deleteById(id);
		// Check if exists returns false if non existing
		boolean check = this.repo.existsById(id);
		// true
		return !check;
	}

}
