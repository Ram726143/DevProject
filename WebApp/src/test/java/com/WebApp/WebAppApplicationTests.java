package com.WebApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebAppApplicationTests {
	@Autowired
	WebAPPController wc;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void get() {
		assertNotNull (wc.getHello());
	}


}
