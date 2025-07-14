package com.crushoncode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);
		Student st = apx.getBean(Student.class);
		st.getStudentDetails();
	}

}
