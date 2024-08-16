package com.EmployeeScopeOfBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Scope("prototype")
//@Component
public class Employee {
	private String name;
	
	public Employee() {
		System.out.println("Bean is Created");
	}
	
	public String toString() {
		return name;
	}
	
	@Value("Raman")
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}

