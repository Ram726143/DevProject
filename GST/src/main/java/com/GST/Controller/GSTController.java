package com.GST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.GST.Entity.GST;
import com.GST.Service.GSTService;

@RestController
public class GSTController {
	@Autowired
	GSTService es;
	@PostMapping (value="/PostGSTAll")
	public String postAll(@RequestBody List<GST> p) {
		return es.postAll(p);
	}
	
	@GetMapping (value="/GetGSTAll")
	public List<GST> getGST() {
		return es.getGST();
	}
	
	@GetMapping (value="/GetGSTpercentage/{p}")
	public int getpercentage(@PathVariable int p) {
		return es.getpercentage(p);
	}

}
