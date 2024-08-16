package com.StudentMarkSheets.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentMarkSheets.Entity.MarkSheet;
import com.StudentMarkSheets.Repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository mr;
	public String setAllval(List<MarkSheet> m) {
		mr.saveAll(m);
		return "Posted SuccessFully";
	}
	

	public int getSem1andSem2Total(int a) {
		return mr.getSem1andSem2Total(a);
	}

}
