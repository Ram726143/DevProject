package com.Customer1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Customer1Configuration {
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

}
