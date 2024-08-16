package com.StudentMarkSheets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StudentMarkSheets.Entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer>{
	@Query(value = "select sem1total+sem2total from mark_sheet where roll_number = ?;",nativeQuery=true)
	public int getSem1andSem2Total(int a);

}
