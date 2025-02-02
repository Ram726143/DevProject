package com.StudentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.StudentDetails.Entity.Student;
import com.StudentDetails.Repository.StudentDetailsRepository;

@Repository
public class StudentDetailsDao {
	@Autowired
	StudentDetailsRepository sr;
	public String postepm(List<Student> s) {
		sr.saveAll(s);
		return "Posted Successfully";
	}
	
	public String PostOneStudentDetail(Student s) {
		sr.save(s);
		return "SuccessFully";
		
	}
	
	public String deleteById(@PathVariable int s) {
		sr.deleteById(s);
		return "Deleting Successfully";
	}
	
	
	public String PutVal( int c,Student s) {
		sr.save(s);
		return "Updating Successfullky";
	}
	
	public List<Student> getStud() {
		return sr.findAll();
	}
	
	public int getidvaluenum(int a) {
		return sr.getidvaluenum(a);
	}


	

}
