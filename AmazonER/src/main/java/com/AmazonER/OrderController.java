package com.AmazonER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService os;
	@PostMapping(value="/postoneorder")
	public String postoneorder(@RequestBody OrderEntity oe) {
		return os.postoneorder(oe);
	}
	
	@GetMapping(value="/getvalcipri")
	public List<Object> getvalcipri() {
		return os.getvalcipri();
	}
	
	@GetMapping(value="/getAllval")
	public List<OrderEntity> getAllval() {
		return os.getAllval();
	}
}
