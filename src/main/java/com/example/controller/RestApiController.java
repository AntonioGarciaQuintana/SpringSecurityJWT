package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
	
	@GetMapping("/api/hi")
	public String hi() {
		return "Hello world! >>> Message from Backend project editado";
	}
	
	

}

