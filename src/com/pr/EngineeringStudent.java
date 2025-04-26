package com.pr;

public class EngineeringStudent extends Student {

	public EngineeringStudent(String id, String name, int rollNo, int age, String school, int marks) {
		super(id, name, rollNo, age, school, marks);
	}

	public void showStream() {
		System.out.println("Stream: Enginnering");
	}
}

