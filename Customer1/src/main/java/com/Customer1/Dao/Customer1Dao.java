package com.Customer1.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Customer1.Entity.Customer1;
import com.Customer1.Repository.Customer1Repository;

@Repository
public class Customer1Dao {
	@Autowired
	Customer1Repository cr;
	public String postAllCustomersDetails(List<Customer1> c) {
		cr.saveAll(c);
		return "Posted Successfully";
	}


}
