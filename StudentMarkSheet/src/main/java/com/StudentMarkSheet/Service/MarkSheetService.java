package com.StudentMarkSheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMarkSheet.Dao.MarkSheetDao;
import com.StudentMarkSheet.Entity.MarkSheet;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao sd;
	public String setAll(List<MarkSheet> s) {
		for(StudentMarkSheet x:s) {
			x.setSem1total(x.getSem1theory()+x.getSem1practicals());
			x.setSem2total(x.getSem2theory()+x.getSem2practicals());
		}
		
		return sd.setAll(s);
	}

}
