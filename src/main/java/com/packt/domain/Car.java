package com.packt.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Data
@Getter
@Setter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NonNull
	private String brand;
	@NonNull
	private String model;
	@NonNull
	private String color;
	@NonNull
	private String registerNumber;
	@NonNull
	private Integer year;
	@NonNull
	private Integer price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner")
	private Owner owner;
}
