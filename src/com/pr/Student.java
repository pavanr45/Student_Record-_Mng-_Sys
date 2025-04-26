package com.pr;


//Encapsulation
public class Student {

	private String id;
	private String name;
	private int rollNo;
	private int age;
	private String school;
	private int marks;
	
	
	public Student(String id, String name, int rollNo, int age, String school, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.school = school;
		this.marks = marks;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("School: " + school);
        System.out.println("Marks: " + marks);
    }	
	
	
	
	
}
