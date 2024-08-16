package com.StudentDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StudentDetails.Entity.Student;

public interface StudentDetailsRepository extends JpaRepository<Student, Integer> {
	@Query(value = "select attendance from student where roll_number = ?;",nativeQuery=true)
	public int getidvaluenum(int a);

}
