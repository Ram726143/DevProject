package com.GST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.GST.Entity.GST;

public interface GSTRepository extends JpaRepository<GST, Integer> {
	@Query(value="select percentage from gst where hsncode=?",nativeQuery = true)
	public int getpercentage(int p);
}

