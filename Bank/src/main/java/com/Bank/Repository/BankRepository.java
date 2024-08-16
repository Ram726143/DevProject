package com.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Bank.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value="select branch from bank where ifsccode=?",nativeQuery = true)
	public String getbranchbank(String a);
	

}
