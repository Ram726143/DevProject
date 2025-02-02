package com.ProJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProJunitApplicationTests {
	@Autowired
	ProJunitController pc;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void get() {
	assertNotNull(pc.getHello());
	}
	@Test
	public void get1() {
		assertEquals(pc.getHello(), "hi");
	}
	@Test
	public void ger2() {
		assertNotNull(pc.getHello1());
	}

}
