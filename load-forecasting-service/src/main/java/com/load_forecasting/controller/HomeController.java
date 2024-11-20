package com.load_forecasting.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load-forecast")
public class HomeController {

	
	@GetMapping
	public ResponseEntity<?> test(){
		return ResponseEntity.ok("load-forecasting-service");
	}
	
}
