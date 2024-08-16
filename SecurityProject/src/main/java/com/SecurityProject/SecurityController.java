package com.SecurityProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	@GetMapping(value="/getStudentis")
	public String getthis() {
		return "This is Student";
	}
	
	@GetMapping(value="/getTrainer")
	public String getthis1() {
		return "This is Trainer";
	}
	
	@GetMapping(value="/getManager")
	public String getthis2() {
		return "This is Manager";
	}

}
