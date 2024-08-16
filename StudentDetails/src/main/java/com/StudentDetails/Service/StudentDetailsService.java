package com.StudentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.StudentDetails.Dao.StudentDetailsDao;
import com.StudentDetails.Entity.Student;
import com.StudentDetails.Exception.AgeException;

@Service
public class StudentDetailsService {
	@Autowired
	StudentDetailsDao sd;
	public String postemp(@RequestBody List<Student> s) {
		return sd.postepm(s);
	}
	
	public String PostOneStudentDetail(Student s)throws AgeException {
		if(s.getAge()<18) {
			throw new AgeException("Age is below 18");
		}
		else {
			return sd.PostOneStudentDetail(s);
		}
	}
		
		
		
		
		
	public String deleteById(@PathVariable int s) {
		return sd.deleteById(s);
	}

	public String PutVal(int c,Student s) {
		return sd.PutVal(c, s);
	}
	
	public List<Student> getStud() {
		return sd.getStud();
	}
	
	public int getidvaluenum(int a) {
		return sd.getidvaluenum(a);
	}
	
	
}
