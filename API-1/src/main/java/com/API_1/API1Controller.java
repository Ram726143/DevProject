package com.API_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API1Controller {
	@GetMapping(value = "/getHello")
	public String getHello() {
		return "HelloWorld";
		}
	
	

}
