package com.API_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class UseRestTemplate {
	@Bean
	public UseRestTemplate rest() {
		return new UseRestTemplate();
	}

}
