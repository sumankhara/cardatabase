package com.packt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packt.domain.Car;
import com.packt.repository.CarRepository;

@RestController
public class CarController {

	@Autowired
	private CarRepository carRepository;
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public Iterable<Car> getCars(){
		return carRepository.findAll();
	}
}
