package com.abstractclass;

public class Student extends School{

	private void studentId() {
		System.out.println("student id is 7654");
	}
	
	public static void main(String[] args) {
		School a = new School();
		a.schoolId();
		
		Student b = new Student();
		b.schoolId();
		b.studentId();
		
		School c = new Student();
		c.schoolId();
		
		//Student d = new School();--NP
		
		
	}
	
}
