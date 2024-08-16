package com.AnnatationPrograms;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NameController {
	@Value("Raman")
	String name;
	@GetMapping(value="/getName")
	public String getName() {
		return name;
	}
	

	
	@GetMapping (value="getGreat12")
	public String findGreat(@RequestParam int a,@RequestParam int b) {
		if(a>b) {
			return a+"is Greater";
		}
		else {
			return b+"is Greater";
		}
		
	}
	
	
	
	
}
