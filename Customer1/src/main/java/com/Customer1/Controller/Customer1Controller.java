package com.Customer1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Customer1.Entity.Customer1;
import com.Customer1.Service.Customer1Service;


@RestController
public class Customer1Controller {
	@Autowired
	RestTemplate rt;	

	@Autowired
	Customer1Service cs;

	
	@PostMapping(value = "/postAllCustomersDetails")
	public String postAllCustomersDetails(@RequestBody List<Customer1> c) {
	    
	    String url = "http://localhost:8080/getbranchbank/";
	   
		c.forEach(x -> {
			String ifsc = x.getIfsccode();
		ResponseEntity<String> r = rt.exchange(url+ifsc, HttpMethod.GET, null, String.class);
			String br = r.getBody();
			x.setBranch(br);
		});
	 
	     	return cs.postAllCustomersDetails(c);
	}

	}

