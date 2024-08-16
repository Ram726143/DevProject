package com.WebApp;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/Phone")
@RestController
public class PhoneController {
	@GetMapping (value="/getPhone")
	public List<Phone> getPhone(@RequestBody List<Phone> p) {
		return p;
	}
	
	@GetMapping (value="/getPhone1")
	public List<String> getPhone1(@RequestBody List<Phone> p) {
		List<String> brands = new ArrayList<>();
		p.forEach(x-> {
			if(x.getPrice()>2500) {
				brands.add(x.getBrand());
			}
		});
		return brands;
	}
	
	@GetMapping (value="/getPhone2")
	public String getPhone2(@RequestBody List<Phone> p) {
		String y="";
		int z=0;
		for(Phone x:p) {
			if(x.getBrand().startsWith("S")) {
				y=x.getColour();
				z=x.getModelYear();
				
			}
		}
		return y+" "+z;
	}
	
	@GetMapping (value="/getPhone3")
	public Phone getPhone3(@RequestBody List<Phone> p) {
		Phone ab=p.get(0);
		for(int i=0;i<p.size();i++) {
			if(p.get(i).getColour().equals("Blue")) {
				ab=p.get(i);
			}
		}
		return ab;
	}
	
	@GetMapping (value="/getPhone4")
	public List<String> getPhone4(@RequestBody List<Phone> p) {
		List <String> ss=p.stream().filter(x->x.getModelYear()<2020 && x.getModelYear()>2015).map(y->y.getBrand()).collect(Collectors.toList());
		return ss;	
	}
	
	@GetMapping (value="/getPhone5")
	public int getPhone5(@RequestBody List<Phone> p) {
		int max=0;
		for(Phone x:p) {
			if(x.getPrice()>max) {
				max=x.getPrice();
			}
		}
		return max;
	}
	
	@GetMapping (value="/getPhone6")
	public String getPhone6(@RequestBody List<Phone> p) {
		String s1="";
		Phone min=p.get(0);
		for(int i=0;i<p.size();i++) {
			if(p.get(i).getPrice()<min.getPrice()) {
				min=p.get(i);
			}
		}
		return s1+min.getBrand()+" "+min.getColour();
	}
}
	


