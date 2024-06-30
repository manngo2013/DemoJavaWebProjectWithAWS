package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	@ResponseBody
	public String sayHello() {
		return "Welcome to my website";
	}
	
	@GetMapping("/hello/{param}")
	@ResponseBody
	public String sayHelloUser(@PathVariable("param") String param) {
		return "Hello: " + param;
	}
}
