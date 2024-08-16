package com.Customer1.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Customer1.Dao.Customer1Dao;
import com.Customer1.Entity.Customer1;

@Service
public class Customer1Service {
	@Autowired
	Customer1Dao cd;
	
	public String postAllCustomersDetails(List<Customer1> c) {
		return cd.postAllCustomersDetails(c);
	}



}
