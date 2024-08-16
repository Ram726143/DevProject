package com.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Vehicle.Dao.CarDao;
import com.Vehicle.Entity.Car;



@Service
public class CarService {
	@Autowired
	CarDao cd;
	public String postemp(@RequestBody Car c) {
		return cd.postepm(c);
	}
	
	public String postAll(@RequestBody List<Car> c) {
		return cd.postAll(c);
	}

	
	public List<Car> getthis(String a) {
		return cd.getthis(a);
	}
	
	public List<Car> getcolor() {
		return cd.getcolor();
	}
	
	public List<Car> getprice(int a) {
		return cd.getprice(a);
	}
	
	public List<Car> getbrand() {
		return cd.getbrand();
	}
	
	public int getmax() {
		return cd.getmax();
	}
	
	public List<Car> getmaxdetail() {
		return cd.getmaxdetail();
	}
	
	public List<Object> getobject() {
		return cd.getobject();
	}
	
	public int getbrandc() {
		return cd.getbrandc();
	}
	
	public List<Car> getassend() {
		return cd.getassend();
	}
	
	public List<Car> getdecs() {
		return cd.getdecs();
	}
	
	public List<Car> getthisc(int p) {
		return cd.getthisc(p);
	}
	
	public List<Car> getpripq(int p,int q) {
		return cd.getpripq(p,q);
	}
	
	public int getpmin() {
		return cd.getpmin();
	}
	

	public int getcount() {
		return cd.getcount();
	}
	
	public List<Car> getorderby() {
		return cd.getorderby();
	} 
}
