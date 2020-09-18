package com.dhony.learning.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dhony.learning.models.Plant;

public interface PlantRepository extends MongoRepository<Plant,String>{

}
