package com.StudentMarkSheets.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMarkSheets.Entity.MarkSheet;
import com.StudentMarkSheets.Service.MarkSheetService;


@RestController
public class MarkSheetController {
	@Autowired
	MarkSheetService ms;
	@PostMapping(value="/poststudvalu")
	public String setAllval(@RequestBody List<MarkSheet> m) {
		return ms.setAllval(m);
	}
	
	@GetMapping(value="/gettotalid/{a}")
	public int getSem1andSem2Total(@PathVariable int a) {
		return ms.getSem1andSem2Total(a);
	}


}
