package com.AmazonER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository or;
	public String postoneorder(OrderEntity oe) {
		or.save(oe);
		return "Post SuccesFully";
	}
	
	public List<Object> getvalcipri() {
		return or.getvalcipri();
	}
	
	public List<OrderEntity> getAllval() {
		return or.findAll();
	}

}
