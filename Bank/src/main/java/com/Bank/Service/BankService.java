package com.Bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Dao.BankDao;
import com.Bank.Entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bd;
	public String postAll(List<Bank> b) {
		return bd.postAll(b);
	}
	
	public String getbranchbank(String a) {
		return bd.getbranchbank(a);
	}
	
	

}
