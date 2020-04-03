package com.lucas.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class GreetingsController {
	
	@GetMapping(value = "/greet/{name}")
	public ResponseEntity<String> greeting(@PathVariable(name = "name") String name){
		return new ResponseEntity<String>("Hello " + name, HttpStatus.OK);
	}
}
