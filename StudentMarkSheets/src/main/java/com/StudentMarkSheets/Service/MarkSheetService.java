package com.StudentMarkSheets.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMarkSheets.Dao.MarkSheetDao;
import com.StudentMarkSheets.Entity.MarkSheet;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;
	public String setAllval(List<MarkSheet> m) {
		for(MarkSheet x:m) {
			x.setSem1Total(x.getSem1Theory()+x.getSem1Practicals());
			x.setSem2Total(x.getSem2Theory()+x.getSem2Practicals());
		}
		
		return md.setAllval(m);
	}
	
	
	public int getSem1andSem2Total(int a) {
		return md.getSem1andSem2Total(a);
	}



}
