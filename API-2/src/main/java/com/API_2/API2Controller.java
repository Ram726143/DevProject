package com.API_2;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class API2Controller {
	@Autowired
	RestTemplate rt;
	
	
	
	@GetMapping(value = "/getAllPojo")
	public List<String> getAllPojo() {
		String url = "http://localhost:8080/GetBrand";
		ResponseEntity<List<UsePojoCar>> re = rt.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<UsePojoCar>>() {});
		List<UsePojoCar> x = re.getBody();
		List<String> xx = x.stream().map(y -> y.getBrand()).collect(Collectors.toList());
		return xx;
	}
	

}
