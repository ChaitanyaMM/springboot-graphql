package com.practice.graphqlapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.graphqlapp.entity.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long>{

}
