package com.example.DMS.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

}
