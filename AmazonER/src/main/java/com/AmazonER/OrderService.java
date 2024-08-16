package com.AmazonER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderDao od;
	public String postoneorder(OrderEntity oe) {
		return od.postoneorder(oe);
	}

	public List<Object> getvalcipri() {
		return od.getvalcipri();
	}
	
	public List<OrderEntity> getAllval() {
		return od.getAllval();
	}
}
