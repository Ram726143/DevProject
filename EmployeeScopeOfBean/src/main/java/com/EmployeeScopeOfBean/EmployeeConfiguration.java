package com.EmployeeScopeOfBean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfiguration implements CommandLineRunner {
	@Autowired
	ApplicationContext ac;

	public void run(String...args) throws Exception {
		Employee e1=ac.getBean(Employee.class);
		System.out.println(e1);
		Employee e2=ac.getBean(Employee.class);
//		e2.setName("Jeeva");
		System.out.println(e2);
		Employee e3=ac.getBean(Employee.class);
		System.out.println(e3);
	}
	
	@Bean
	@Scope("prototype")
	public Employee getemp() {
		return new Employee();
	}
}
 