package com.StudentDetails.Controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails.Entity.Student;
import com.StudentDetails.Exception.AgeException;
import com.StudentDetails.Service.StudentDetailsService;

@RestController
public class StudentDetailsController {
	@Autowired
	StudentDetailsService ss;
	
	@PostMapping (value="/PostStudentD")
	public String postemp(@RequestBody List<Student> t) {
		return ss.postemp(t);
	}

	@PostMapping (value="/PostOneStudentDetail")
	public String PostOneStudentDetail(@RequestBody Student s)throws AgeException {
		return ss.PostOneStudentDetail(s);
	}
	
	@DeleteMapping (value="/DeleteIdVal/{s}")
	public String deleteById(@PathVariable int y) {
		return ss.deleteById(y);
	}
	
	@PutMapping (value="/PutStudVal/{c}")
	public String PutVal(@PathVariable int c,@RequestBody Student s) {
		return ss.PutVal(c,s);
	}
	
	@GetMapping(value="/getStudentVal") 
	public List<Student> getStud() {
		return ss.getStud();
	}
	
	@GetMapping(value="/getvalid/{a}") 
	public int getidvaluenum(@PathVariable int a) {
		return ss.getidvaluenum(a);
	}
	
	Logger log1= Logger.getLogger(StudentDetailsController.class);
	@PutMapping (value="/PutStudVal123/{c}")
	public String PutVal1(@PathVariable int c,@RequestBody Student s) {
		PropertyConfigurator.configure("Log");
		log1.info(ss.PutVal(c,s));
		return ss.PutVal(c,s);

	}

	@GetMapping(value="/getStudentVal1")
	public List<Student> getStud1() {
		PropertyConfigurator.configure("Log");
		log1.info(ss.getStud());
		return ss.getStud();
	}
	
	
	

}
