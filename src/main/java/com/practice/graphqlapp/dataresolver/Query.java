package com.practice.graphqlapp.dataresolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.graphqlapp.entity.Vehicle;
import com.practice.graphqlapp.service.VehicleService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private VehicleService vehicleService;

	public Iterable<Vehicle> findAll() {
		return vehicleService.findAll();
	}

	public Optional<Vehicle> findById(long id) {
		return vehicleService.findById(id);
	}

}
