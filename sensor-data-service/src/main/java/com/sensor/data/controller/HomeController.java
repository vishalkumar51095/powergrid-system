package com.sensor.data.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor-data")
public class HomeController {

	@GetMapping
	public ResponseEntity<?> test(){
//		Map<String, Object> response=new HashMap<>();
//		response.put("name", "Vishal Kumar");
//		response.put("college", "BHU");
		return ResponseEntity.ok("Sensor-data-service");
	}
}
