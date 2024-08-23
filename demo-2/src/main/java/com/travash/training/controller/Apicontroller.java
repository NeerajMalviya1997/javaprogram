package com.travash.training.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.travash.training.model.User;

@RestController
@RequestMapping("/admin")
public class Apicontroller {

	@GetMapping("/welcome")
	public String sayHello() {

		return "welcome"; // it will be represented as raw data.
	}

	@PostMapping("/welcome")
	public String sayHello(@RequestPart String name, @RequestPart String raj) {
		System.out.println(name + raj);

		return name + " " + raj; // it will be represented as raw data.
	}

	@GetMapping("/student/{roll}")
	public String getStudent(@PathVariable("roll") String roll) {

		return roll;
	}

	
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	
	
}
