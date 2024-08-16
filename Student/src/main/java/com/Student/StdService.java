package com.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StdService {
	@Autowired
	StdDao sd;
	public String postthis(@RequestBody Student s) {
		return sd.postthis(s);
	}
	
	public List<Student> getStudent() {
		return sd.getStudent();
	}
	
	public String postAll(@RequestBody List<Student> s) {
		return sd.postAll(s);
	}
	

	public Optional<Student> getId(int s) {
		return sd.getId(s);
}
	public String DeleteId(int s) {
		return sd.DeleteId(s);
	}
	
	public String PutVal(int c,Student s) {
		return sd.PutVal(c,s);
}
}
