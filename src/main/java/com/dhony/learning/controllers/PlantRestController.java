package com.dhony.learning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhony.learning.models.Plant;
import com.dhony.learning.service.PlantService;

@RestController
@RequestMapping("/api")
public class PlantRestController {

	
	@Autowired
	private PlantService plantService;
	
	public PlantRestController(PlantService plantService) {
		this.plantService = plantService;
	}
	
	@GetMapping("/allplants")
	public List<Plant> getAllPlants(){
		
		System.out.println(plantService.getAllPlants());
		return plantService.getAllPlants();
	}
}
