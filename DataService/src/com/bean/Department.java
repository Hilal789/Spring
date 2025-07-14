package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	 @Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

	 String name="fhk";

	
	
	
	

}
