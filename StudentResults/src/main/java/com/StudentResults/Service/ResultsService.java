package com.StudentResults.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentResults.Dao.ResultsDao;
import com.StudentResults.Entity.Results;


@Service
public class ResultsService {
	@Autowired
	ResultsDao rd;
	public String details(List<Results> a) {
		return rd.setAllList(a);
	}
	


}
