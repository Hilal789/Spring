package com.bean;

import org.springframework.stereotype.Component;

@Component
public class FileLogWriter implements LogWriter{

	@Override
	public void writing() {
		System.out.println("Writing with File log");
		
	}
	
	

}
