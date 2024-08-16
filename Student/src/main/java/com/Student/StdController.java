package com.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StdController {
	@Autowired
	StdService ss;
	@PostMapping (value="/PostOneStd")
	public String postthis(@RequestBody Student s) {
		return ss.postthis(s);
	}
	
	@GetMapping(value="/getStudent")
	public List<Student> getStudent() {
		return ss.getStudent();
	}
	
	@PostMapping (value="/PostSaveAll")
	public String postAll(@RequestBody List<Student> s) {
		return ss.postAll(s);
	}
	
	@GetMapping (value="/GetFindById/{s}")
	public Optional<Student> getId(@PathVariable int s) {
		return ss.getId(s);
	
}
	
	@DeleteMapping (value="/DeleteIdVal/{s}")
	public String DeleteId(@PathVariable int s) {
		return ss.DeleteId(s);
}
	
	@PutMapping (value="/PutVal/{c}")
	public String PutVal(@PathVariable int c,@RequestBody Student s) {
		return ss.PutVal(c,s);
	}
}
	
