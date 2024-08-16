package com.SpringProfilePro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringProfileProController {
	@Value("${department}")
	public String name;
	
	@GetMapping(value="/getdepmt")
	public String getDpmt() {
		return name;
	}

}
