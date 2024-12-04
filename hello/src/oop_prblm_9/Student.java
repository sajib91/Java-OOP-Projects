package oop_prblm_9;
import java.util.ArrayList;

public class Student {
	private String name;
	private int grade;
	
	private ArrayList<String> courses;

	public Student(String name, int grade) {
		
		this.name = name;
		this.grade = grade;
		this.courses = new ArrayList<String> ();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public ArrayList<String> getCourse(){
		return courses;
	}
	
	public void addCourse(String course) {
		courses.add(course);
		
	}
	public void removeCourse(String course) {
		courses.remove(course);
	}
	
	public void printStudentDetails() {
		System.out.println("\nName: "+name);
		System.out.println("Grade: "+grade);
		System.out.println();
	}

}
