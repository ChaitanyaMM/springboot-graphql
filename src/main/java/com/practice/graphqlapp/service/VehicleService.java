package com.practice.graphqlapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.graphqlapp.entity.Vehicle;
import com.practice.graphqlapp.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	public Vehicle createVehicle(String carBrand, String modelType, String registrationNumber, String rcNumber,
			String fuelType) {
		Vehicle vehicle = new Vehicle();
		vehicle.setModelType(modelType);
		vehicle.setCarBrand(carBrand);
		vehicle.setRegistrationNumber(registrationNumber);
		vehicle.setRcNumber(rcNumber);
		vehicle.setFuelType(fuelType);
		return vehicleRepository.save(vehicle);
	}

	public Optional<Vehicle> findById(long id) {
		return vehicleRepository.findById(id);
	}

	public Iterable<Vehicle> findAll() {
		return vehicleRepository.findAll();
	}

	public void deleteById(long id) {
		vehicleRepository.deleteById(id);
	}

	public Vehicle updateVehicle(long id, Vehicle updateVehicle) {
		Vehicle vehicle = updateVehicle;
		vehicle.setId(id);
		return vehicleRepository.save(vehicle);
	}

}
