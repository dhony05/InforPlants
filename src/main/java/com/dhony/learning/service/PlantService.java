package com.dhony.learning.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhony.learning.models.Plant;
import com.dhony.learning.repository.PlantRepository;
@Service
public class PlantService  {
	
	@Autowired
	private PlantRepository plantRepository;
	
	public List<Plant> getAllPlants(){
		 return  plantRepository.findAll();
	
	}
	
	
	


}
