package com.sks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestingController {
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("name") String name, @RequestParam("surname")String surname) {
		return "Welcome " + name+ " " + surname + " to your first spring boot application";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "This is the home url";
	}
	
	
		
	

}