package com.practice.graphqlapp.dataresolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.graphqlapp.entity.Vehicle;
import com.practice.graphqlapp.service.VehicleService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {
	@Autowired
	private VehicleService vehicleService;

	public Vehicle createVehicle(String carBrand,String modelType,String registrationNumber,String rcNumber,String fuelType)  {
		return vehicleService.createVehicle(carBrand,modelType,registrationNumber,rcNumber,fuelType);
	}

	public Vehicle updateVehicle(long id, Vehicle vehicle) {
		return vehicleService.updateVehicle(id, vehicle);

	}

	public void deleteVehicle(long id) {
		vehicleService.deleteById(id);
	}

}
