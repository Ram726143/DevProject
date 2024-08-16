package com.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Vehicle.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	@Query (value="select * from car where color=?",nativeQuery=true)
	public List<Car> getthis(String a);
	
	@Query (value="select * from car where color='Green'",nativeQuery=true)
	public List<Car> getcolor();
	
	@Query (value="select * from car where price>?",nativeQuery=true)
	public List<Car> getprice(int a);
	
	@Query (value="select * from car where length(brand)>5",nativeQuery=true)
	public List<Car> getbrand();
	
	@Query (value="select min(price) from car",nativeQuery=true)
	public int getmax();
	
	@Query (value="select * from car where price=(select min(price) from car)",nativeQuery=true)
	public List<Car> getmaxdetail();

	@Query (value="select brand,price from car",nativeQuery=true)
	public List<Object> getobject();
	
	@Query (value="select count(brand) from car",nativeQuery=true)
	public int getbrandc();
	
	@Query (value="select * from car order by price",nativeQuery=true)
	public List<Car> getassend();
	
	@Query (value="select * from car order by price desc",nativeQuery=true)
	public List<Car> getdecs();
	
	@Query (value="select c from Car c where c.price<:p")
	public List<Car> getthisc(@Param ("p")int p);
	
	@Query (value="select c from Car c where c.price>:p and c.price<:q")
	public List<Car> getpripq(@Param ("p")int p, @Param ("q")int q);
	
	@Query (value="select min(c.price) from Car c")
	public int getpmin();
	
	@Query (value="select count(*) from Car c")
	public int getcount();
	
	@Query (value="select c from Car c order by brand")
	public List<Car> getorderby();
}
