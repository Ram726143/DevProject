package com.SecurityProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class MyConfiguration extends WebSecurityConfigurerAdapter{
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("Nandhini").password("$2a$12$9OV85KdiQjrw3hrZq5Kn8ONy7xCoOdOZU92mXAeO4zVGe.5S.U3Z6").roles("Student");
//	}
////	@Bean
////	public PasswordEncoder getpass() {
////		return NoOpPasswordEncoder.getInstance();
////	}
//	
//	@Bean
//	public PasswordEncoder getpass1() {
//		return new BCryptPasswordEncoder(12);
//	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Nandhini").password("$2a$12$9OV85KdiQjrw3hrZq5Kn8ONy7xCoOdOZU92mXAeO4zVGe.5S.U3Z6").roles("Student").and().withUser("Raman").password("$2a$12$MoLsOaIj.whqpPBjgg909eXPlSHu4sA0UafOEpmC3Kijogyq3FgjW").roles("Trainer").and().withUser("Aathi").password("$2a$12$215EHlR.uLDv.xZ1ateUduLHfb0uxJiT9ALb07FKmH7bungE6L.ru").roles("Manager");
	}
	
	@Bean
	public PasswordEncoder getpass2() {
		return new BCryptPasswordEncoder(12);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/getManager").hasRole("Manager");
		http.authorizeRequests().antMatchers("/getTrainer").hasAnyRole("Trainer","Manager");
		http.authorizeRequests().antMatchers("/getStudentis").permitAll().and().formLogin();
	}	
}
