package com.pr;

public class GradeCalculator {

	
	// Polymorphism
	public String calculateGrade(int marks) {
		if(marks >=90) {
			return "A+";
		}
		if(marks >=75) {
			return "A";
		}
		if(marks >=60) {
			return "B";
		}
		if(marks >=40) {
			return "AC";
		}
		else return "Fail";
	}
}
