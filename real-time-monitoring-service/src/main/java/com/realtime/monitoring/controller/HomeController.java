package com.realtime.monitoring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor")
public class HomeController {

	@GetMapping
	public ResponseEntity<?> test(){
		return ResponseEntity.ok("monitoring service");
	}
}
