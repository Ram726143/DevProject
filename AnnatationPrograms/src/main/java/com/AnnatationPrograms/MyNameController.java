package com.AnnatationPrograms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {
	@Value("${myname}")
	int name;
	@GetMapping(value="/getmyName")
	public int getthis() {
		return name;
	}

}
