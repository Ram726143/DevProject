package com.AmazonER;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{
	@Query(value="select city,price from order_table join product_table",nativeQuery = true)
	public List<Object> getvalcipri();

}
