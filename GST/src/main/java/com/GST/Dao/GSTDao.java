package com.GST.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.GST.Entity.GST;
import com.GST.Repository.GSTRepository;

@Repository
public class GSTDao {
	@Autowired
	GSTRepository er;
	
	public String postAll(List<GST> e) {
		er.saveAll(e);
		return "Posted in Successfully";
	}
	public List<GST> getGST() {
		return er.findAll();
	}
	
	public int getpercentage(int p) {
		return er.getpercentage(p);
	}

}
