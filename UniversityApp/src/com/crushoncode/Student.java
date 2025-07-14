package com.crushoncode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

		@Autowired
		@Qualifier("oxfordUniversity")
		University university;

		
		public void getStudentDetails()
		{
			System.out.println("Student Belogs to "+university.getUniversityName());
		}
		
		
}
