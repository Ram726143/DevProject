package com.StudentMarkSheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentMarkSheet.StudentMarkSheetApplication;
import com.StudentMarkSheet.Entity.MarkSheet;
import com.StudentMarkSheet.Repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository mr;
	

}
