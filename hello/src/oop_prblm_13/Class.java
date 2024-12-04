package oop_prblm_13;
import java.util.ArrayList;

public class Class {
      private String className;
      private Teacher teacher;
      private ArrayList<Student> students = new ArrayList<Student>();
      
	 public Class(String className, Teacher teacher) {
		
		this.className = className;
		this.teacher = teacher;
	 }

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}
      
      
}
