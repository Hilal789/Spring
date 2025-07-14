package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id=1;
	String name="Hilal";
	Department dept;


	@Autowired
	public Employee(Department dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	
}
