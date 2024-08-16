package com.GST.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.GST.Dao.GSTDao;
import com.GST.Entity.GST;

@Service
public class GSTService {
	@Autowired
	GSTDao ed;
	public String postAll(@RequestBody List<GST> p) {
		return ed.postAll(p);
	}
	
	public List<GST> getGST() {
		return ed.getGST();
	}
	
	public int getpercentage(int p) {
		return ed.getpercentage(p);
	}
	

}
