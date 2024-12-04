package oop_prblm_13;

public class Teacher {
	private String name;
	private String subject;
	private String ID;
	
	public Teacher(String name, String subject, String iD) {
		
		this.name = name;
		this.subject = subject;
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
		
		

}
