package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogManager {

	private FileLogWriter fileWriter;

	
	@Autowired
	public void setFileWriter(FileLogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	
	public void dis() {
		System.out.println("Write file via file Weiter");
	}
	
	

}
