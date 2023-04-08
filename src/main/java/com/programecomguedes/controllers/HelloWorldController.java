package com.programecomguedes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWorld(String nome) {
		return "Hello World " + nome + "!";
	}
	
	@PostMapping("/hellopost")
	public String helloPost(String nome) {
		return "Hello Post " + nome + "!";
	}
}
