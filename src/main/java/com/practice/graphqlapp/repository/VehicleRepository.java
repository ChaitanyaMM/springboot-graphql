package com.practice.graphqlapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.graphqlapp.entity.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long>{

}
