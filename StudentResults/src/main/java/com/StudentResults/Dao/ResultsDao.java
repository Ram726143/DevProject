package com.StudentResults.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentResults.Entity.Results;
import com.StudentResults.Repository.ResultsRepository;


@Repository
public class ResultsDao {
	@Autowired
	ResultsRepository rr;
	public String setAllList(List<Results> a) {
		rr.saveAll(a);
		return "Post success";
	}
	

}
