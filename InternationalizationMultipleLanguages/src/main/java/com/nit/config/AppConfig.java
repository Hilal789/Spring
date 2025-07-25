package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean("messageSource")
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source=new ResourceBundleMessageSource();
		source.setBasename("com/nit/pro/messages");
		return source;
	}
	

}
