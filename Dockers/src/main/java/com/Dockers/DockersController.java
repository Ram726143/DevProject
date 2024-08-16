package com.Dockers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockersController {
	@GetMapping("getDocvals")
	public String getDoc() {
		return "In my DevOps";
	}

}
