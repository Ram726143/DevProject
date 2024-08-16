package com.StudentMarkSheet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMarkSheet.Service.MarkSheetService;

@RestController
public class MarkSheetController {
	@Autowired
	MarkSheetService ss;
	@PostMapping(value="/postall")
	public String setAll(@RequestBody List<Marksheet>m){
		
		return ss.setAll(m);
	}

}
