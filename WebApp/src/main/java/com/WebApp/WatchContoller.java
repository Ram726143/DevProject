package com.WebApp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/Watch")
@RestController
public class WatchContoller {
	@GetMapping (value="/getWatch")
	public Watch getWatch(@RequestBody Watch w) {
		return w;
	}
	
	@GetMapping (value="/getWatchs")
	public String getWatchs(@RequestBody Watch w) {
		return w.getBrand();
	}
	
	@GetMapping (value="/getWatches")
	public String getWatches(@RequestBody Watch w) {
		return w.getBrand()+" "+w.getColour()+" "+w.getModelYear()+" "+w.getPrice()+" "+w.getShrapType();
	}
	
	@GetMapping (value="/getWatchss")
	public List<Watch> getWatchss(@RequestBody List<Watch> w) {
		return w;
	}
	
	@GetMapping (value="/getWatchses")
	public List<Watch> getWatchses(@RequestBody List<Watch> w) {
		return w;
	}
	
	
	

}
