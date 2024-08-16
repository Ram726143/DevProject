package com.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StdDao {
@Autowired
StdRepository sr;
public String postthis(Student s) {
	sr.save(s);
	return "Posted Successfully";
}
public List<Student> getStudent() {
	return sr.findAll();
	
}

public String postAll(List<Student> s) {
	sr.saveAll(s);
	return "Post in  Successfully";
}

public Optional<Student> getId(int s) {
	return sr.findById(s);
}

public String DeleteId(int s) {
	 sr.deleteById(s);
	 return "Delete Successfully";
}

public String PutVal(int c,Student s) {
	sr.save(s);
	return "Updating Successfullky";
}
}