package project1;

public class Employee {
	   private String name;
	   private String id;
	   private int age;
	   private double basicSalary;
	   
	  public Employee(String name, String id, int age, double basicSalary) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public double getBasicSalary() {
		return basicSalary;
	}
	
	public double calculateBonus() {
		return 0;
	}
	  
	   
	}

