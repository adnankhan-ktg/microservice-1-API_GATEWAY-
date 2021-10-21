package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@PostMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "user service is down, please try again later";
	}

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack1() {
		return "user service is down, please try again later";
	}
	
	@GetMapping("/contactServiceFallBack")
	public String contactServiceFallBack() {
		return "contact service is down please try again later";
	}

}
