package com.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Vehicle.Entity.Car;
import com.Vehicle.Repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository cr;
	public String postepm(Car c) {
		cr.save(c);
		return "Posted Successfully";
	}
	
	public String postAll(List<Car> c) {
		cr.saveAll(c);
		return "Posted in Successfully";
	}

	
	public List<Car> getthis(String a) {
		return cr.getthis(a);
	}
	
	public List<Car> getcolor() {
		return cr.getcolor();
	}
	
	public List<Car> getprice(int a) {
		return cr.getprice(a);
	}
	
	public List<Car> getbrand() {
		return cr.getbrand();
	}
	
	public int getmax() {
		return cr.getmax();
	}

	public List<Car> getmaxdetail() {
		return cr.getmaxdetail();
	}
	
	public List<Object> getobject() {
		return cr.getobject();
	}
	
	public int getbrandc() {
		return cr.getbrandc();
	}
	
	public List<Car> getassend() {
		return cr.getassend();
	}
	
	public List<Car> getdecs() {
		return cr.getdecs();
	}
	
	public List<Car> getthisc(int p) {
		return cr.getthisc(p);
	}
	 
	public List<Car> getpripq(int p,int q) {
		return cr.getpripq(p,q);
	}
	
	public int getpmin() {
		return cr.getpmin();
	}
	public int getcount() {
		return cr.getcount();
	}
	public List<Car> getorderby() {
		return cr.getorderby();
	}
}
