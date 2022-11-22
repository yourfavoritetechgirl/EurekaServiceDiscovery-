package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	
	@GetMapping("/users/status")
	public String status() {
		return "Users ms is working... ";
	}

}
