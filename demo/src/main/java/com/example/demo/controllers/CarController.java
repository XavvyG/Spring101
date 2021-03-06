package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.model.Car;
import com.example.demo.data.service.CarService;

@RestController // allows us to send JSON data back, or other forms of data medium, indicates
				// this is a component/bean to the AppContext

@RequestMapping(path = "/car")


public class CarController {
//	List<Car> actualCars = List.of(new Car(2.0, 30000, 2010, "red", "mail", "van"),
//			new Car(1.8, 45000, 2010, "blue", "big", "lorry"));
	
	private CarService service;
	
	public CarController(CarService service) {
		this.service = service;
	}
	
	// localhost:8080/car
	// 127.0.0.1:8080/car

	@GetMapping("getID/{id}")
	public ResponseEntity<Car> getCar(@PathVariable Integer id){
        ResponseEntity<Car> response = new ResponseEntity<Car>(this.service.getCar(id), HttpStatus.FOUND);
        return response;
	}
	@GetMapping("/colour/{colour}")
	public ResponseEntity<List<Car>> getCarByColour(@PathVariable String colour) {
        return new ResponseEntity<List<Car>>(this.service.getCarByColour(colour), HttpStatus.FOUND);
	}

	@GetMapping("/make/{make}")
	public ResponseEntity<List<Car>> getCarByMake(@PathVariable String make) {
        return new ResponseEntity<List<Car>>(this.service.getCarByMake(make), HttpStatus.FOUND);
	}

	@GetMapping("/model/{model}")
	public ResponseEntity<List<Car>> getCarByModel(@PathVariable String model) {
        return new ResponseEntity<List<Car>>(this.service.getCarByModel(model), HttpStatus.FOUND);
	}

	@GetMapping("/year/{year}")
	public ResponseEntity<List<Car>> getCarByYearManufactured(@PathVariable Integer year) {
        return new ResponseEntity<List<Car>>(this.service.getCarByYearManufactured(year), HttpStatus.FOUND);
	}

    @GetMapping("/getAll")
    public ResponseEntity<List<Car>> get() {
        ResponseEntity<List<Car>> response = new ResponseEntity<List<Car>>(this.service.getAllCars(), HttpStatus.OK);
        return response;
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Car> updateCar(@RequestBody Car car, @PathVariable Integer id){
        ResponseEntity<Car> response = new ResponseEntity<Car>(this.service.updateCar(car, id), HttpStatus.ACCEPTED);
        return response;
    }
    
    @PostMapping("/create")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        ResponseEntity<Car> response = new ResponseEntity<Car>(this.service.addCar(car), HttpStatus.CREATED);
        return response;
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> removeCar(@PathVariable Integer id){
    	boolean deleted = this.service.removeCar(id);
    	
    	if (deleted) {
    		return new ResponseEntity<>(HttpStatus.OK);
    	}else {
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}

    }
    
//    
//    // Path variables are specified in the url    
//    // i.e. localhost:8080/car/3 where 3 is the path variable   
//    
//    @GetMapping(path = "/{id}") // the variable is specified in brackets    
//    public ResponseEntity<Integer> get(@PathVariable("id") Integer id) {
//        // iterate over list            
//    	// find element with id equal to the passed in id        
//    	// return found element or an empty Car object
//    	return ResponseEntity.of(Optional.ofNullable(id));    
//    }
}