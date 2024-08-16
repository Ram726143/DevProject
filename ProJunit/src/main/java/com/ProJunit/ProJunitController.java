package com.ProJunit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProJunitController {
	@GetMapping(value="/getHello")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping(value="/getHello1")
	public String getHello1() {
		return null;
	}

}
