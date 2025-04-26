package com.pr;
import java.util.*;

public class StudentManagementSystem {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<EngineeringStudent> students = new ArrayList<>();
	static GradeCalculator gc = new GradeCalculator();
	static OfflineExam exam = new OfflineExam();
	
	
	public static void main(String[] args) {
		 OfflineExam exam = new OfflineExam();
	        
	        exam.examResult(85);   // Output: Congratulations...!
	        exam.examResult(30);   // Output: Better luck next time! Work harder...
	    
		
		while(true) {
			
			System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort by Marks");
            System.out.println("7. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // buffer clear
            
            switch(choice) {
            case 1: addStudent(); break;
            case 2: viewAll(); break;
            case 3: searchById(); break;
            case 4: updateMarks(); break;
            case 5: deleteStudent(); break;
            case 6: sortByMarks(); break;
            case 7: 
                System.out.println("Exiting... Bye!");
                return;
            default: System.out.println("Invalid choice!");
        }
            }
            
		}


	private static void addStudent() {
		System.out.println("ID: ");
		String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // buffer clear
        System.out.print("School: ");
        String school = sc.nextLine();
        System.out.print("Marks: ");
        int marks = sc.nextInt();
		
        EngineeringStudent s = new EngineeringStudent(id, name, roll, age, school, marks);
        students.add(s);
        System.out.println("Student added successfully!");
	}
	static void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No student records found!");
            return;
        }

        for (EngineeringStudent s : students) {
            s.displayInfo();
            s.showStream();
            exam.examResult(s.getMarks());
            String grade = gc.calculateGrade(s.getMarks());
            System.out.println("Grade: " + grade);
        }
    }

    static void searchById() {
        System.out.print("Enter student ID to search: ");
        String id = sc.nextLine();
        for (EngineeringStudent s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void updateMarks() {
        System.out.print("Enter student ID to update marks: ");
        String id = sc.nextLine();
        for (EngineeringStudent s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.print("Enter new marks: ");
                int newMarks = sc.nextInt();
                s.setMarks(newMarks);
                System.out.println("Marks updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String id = sc.nextLine();
        Iterator<EngineeringStudent> itr = students.iterator();
        while (itr.hasNext()) {
            EngineeringStudent s = itr.next();
            if (s.getId().equalsIgnoreCase(id)) {
                itr.remove();
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void sortByMarks() {
        if (students.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }
        students.sort((s1, s2) -> s2.getMarks() - s1.getMarks());
        System.out.println("Students sorted by marks (high to low):");
        viewAll();
    }
}
	


