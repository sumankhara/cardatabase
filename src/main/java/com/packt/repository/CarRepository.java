package com.packt.repository;

import org.springframework.data.repository.CrudRepository;

import com.packt.domain.Car;

public interface CarRepository extends CrudRepository<Car, Long> {

}
