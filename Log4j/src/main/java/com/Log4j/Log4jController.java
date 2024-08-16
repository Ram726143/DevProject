package com.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Log4jController {
		
Logger log= Logger.getLogger(Log4jController.class);
		
		@GetMapping(value="get")
		public String get() {
			
			PropertyConfigurator.configure("Sample_File");
			log.info("This is from Infro");
			log.error("this error");
			int a=5;
			int b=0;
			try {
				b=a/0;
			}
			catch(ArithmeticException c) {
				return "Can't divide by zero";
			}
			return "Hello world";
			
		}
		
	}
	
