package oop_prblm_9;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Sajib",18);
		Student s2 = new Student("Masud",15);
		
		s1.printStudentDetails();
		s2.printStudentDetails();
		
		s1.addCourse("math");
		s1.addCourse("java");
		
		s2.addCourse("calculus");
		s2.addCourse("stat");
		
		System.out.println("Name: "+s1.getName()+"; Course: "+s1.getCourse());
		
		System.out.println("Adding a course: "+s1.getName());
		s1.addCourse("GE");
		System.out.println("Name: "+s1.getName()+"; Course: "+s1.getCourse());

	}

}
