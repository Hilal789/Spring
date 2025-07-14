package com.crushoncode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {
	
	@Bean("delhiUniversity")
	public University DelhiUniversity()
	{
		return new University("Delhi University");
	}
	@Bean("oxfordUniversity")
	public University OxfordUniversity()
	{
		return new University("Oxford University");
	}
}
