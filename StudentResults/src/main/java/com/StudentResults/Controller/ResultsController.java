package com.StudentResults.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.StudentResults.Entity.Results;
import com.StudentResults.Service.ResultsService;

@RestController
public class ResultsController {
	@Autowired
	ResultsService rs;
	@Autowired
	RestTemplate rt;
	

	@PostMapping(value="details")
	public String details(@RequestBody List<Results> a) {	
		
		
		
		String url1 = "http://localhost:8080/getvalid/";
		String url2 = "http://localhost:8081/gettotalid/";
		a.forEach(x -> {
		int rol = x.getRollNumber();
		ResponseEntity<Integer> r1 = rt.exchange(url1+rol,HttpMethod.GET,null,Integer.class);	
		ResponseEntity<Integer> r2 = rt.exchange(url2+rol,HttpMethod.GET,null,Integer.class);	
	    int at = r1.getBody();
	    int sum = r2.getBody();
	    if(at>95 && sum<=195) {
	       int total = sum+5;
	       x.setTotalMarks(total);
	       x.setPercentage(total/2);
	    }
	    else {
	    	x.setTotalMarks(sum);
	    	x.setPercentage(sum/2);
	    }
		});		
		return rs.details(a);
	}

	}