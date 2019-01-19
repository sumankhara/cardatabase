package com.packt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.domain.Car;
import com.packt.domain.Owner;
import com.packt.repository.CarRepository;
import com.packt.repository.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			Owner owner1 = new Owner("John", "Johnson");
			Owner owner2 = new Owner("Mary", "Robinson");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);
			Car car = new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1);
			carRepository.save(car);
			car = new Car("Maruti", "Swift", "Silver", "WB08C5984", 2016, 550000, owner2);
			carRepository.save(car);
			car = new Car("Maruti", "Alto", "Brick Red", "WB18A8948", 2010, 300000, owner2);
			carRepository.save(car);
		};
	}
}

