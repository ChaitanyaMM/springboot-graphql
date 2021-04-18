package com.practice.graphqlapp.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String carBrand;
	private String modelType;
	private String registrationNumber;
	private String rcNumber;
	private String fuelType;

}
