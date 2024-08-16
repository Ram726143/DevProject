package com.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Vehicle.Entity.Car;
import com.Vehicle.Service.CarService;


@RestController
public class CarController {
	@Autowired
	CarService cs;
	@PostMapping (value="/PostCar")
	public String postemp(@RequestBody Car c) {
		return cs.postemp(c);
	}
	
	@PostMapping (value="/PostCarAll")
	public String postAll(@RequestBody List<Car> c) {
		return cs.postAll(c);
	}
	

	@GetMapping(value="/getbrand/{a}")
	public List<Car> getthis(@PathVariable String a) {
		return cs.getthis(a);
	}
	
	@GetMapping (value="/GetColor")
	public List<Car> getcolor() {
		return cs.getcolor();
	}
	
	@GetMapping (value="/GetPrice/{a}")
	public List<Car> getprice(@PathVariable int a) {
		return cs.getprice(a);
	}
	
	@GetMapping (value="/GetBrand")
	public List<Car> getbrand() {
		return cs.getbrand();
	}
	
	@GetMapping (value="/GetMax")
	public int getmax() {
		return cs.getmax();
	}
	
	@GetMapping (value="/GetMaxDetail")
	public List<Car> getmaxdetail() {
		return cs.getmaxdetail();
	}
	
	@GetMapping (value="/GetobjectVal")
	public List<Object> getobject() {
		return cs.getobject();
	}
	
	@GetMapping (value="/Getbc")
	public int getbrandc() {
		return cs.getbrandc();
	}
	
	@GetMapping (value="/GetAssend")
	public List<Car> getassend() {
		return cs.getassend();
	}

	@GetMapping (value="/GetDessend")
	public List<Car> getdecs() {
		return cs.getdecs();
	}
	
	@GetMapping (value="/GetCarP/{p}")
	public List<Car> getthisc(@PathVariable int p) {
		return cs.getthisc(p);
	}
	
	@GetMapping (value="/GetCarpq/{p}/{q}")
	public List<Car> getpripq(@PathVariable int p, @PathVariable int q) {
		return cs.getpripq(p,q);
	}
	
	@GetMapping (value="/GetCarpq")
	public int getpmin() {
		return cs.getpmin();
	}
	
	@GetMapping(value="/GetCount")
	public int getcount() {
		return cs.getcount();
	}
	
	@GetMapping(value="/getorderby")
	public List<Car> getorderby() {
		return cs.getorderby();
	}
	
}
