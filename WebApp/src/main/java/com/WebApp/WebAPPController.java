package com.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WebAPPController {
	@GetMapping (value="/getHello")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping (value="/getName/{name}")
	public String getName(@PathVariable String name) {
		return "Hello"+name;
	}
	
	@GetMapping (value="/getName/{a}/{b}")
	public int getName(@PathVariable int a,@PathVariable int b) {
		return a/b;
	}
	
	@GetMapping (value="getGreat")
	public String findGreat(@RequestParam int a,@RequestParam int b) {
		if(a>b) {
			return a+"is Greater";
		}
		else {
			return b+"is Greater";
		}
		
	}
	
	@GetMapping (value="getPass")
	public String getSuccess(@RequestParam String userName,@RequestParam String passWord) {
		if(userName.equals("ramkumar") && passWord.equals("ram@07")) {
			return "Successfully Login";
		}
		else {
			return "Incorrect PassWord";
		}	
	}
	
	@GetMapping (value="getException")
		public String getExcep(@RequestParam int val,@RequestParam int val1) throws DeleteException{
			if(val>val1) {
				return "bye";
			}
			else {
				throw new DeleteException("haii");
			}
			
		}
	
	class DeleteException extends Exception {
		public DeleteException(String msg) {
			super(msg);
		}
	}
}
