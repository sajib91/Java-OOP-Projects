/**Write a Java program that creates a class hierarchy for employees of a company. 
 The base class should be Employee, with subclasses Manager, Developer, and Programmer
 Each subclass should have properties such as name, address, salary, and job title.
 Implement methods for calculating bonuses, generating performance  reports, and managing projects.
 
 */


package inheritance2;

public class Main {

	public static void main(String[] args) {
		 Manager manager = new Manager("Sajib Bhuiyan","Dhaka, Bangladesh-1000",50000.0,"Manager",10);
		 Developer developer = new Developer("Happy","Rangpur,Bangladesh-5401",40000.0,"Developer","Java");
		 Programmer programmer = new Programmer("Jani na","Rangpur",45000.0,"Programmer","python");
		 
		 System.out.println("Manager Bonus: "+manager.calculateBonus());
		 System.out.println("Developer Bonus: "+developer.calculateBonus());
		 System.out.println("Programmer Bonus: "+programmer.calculateBonus());
		 
		 System.out.println();
		 System.out.println(manager.gereratePerformanceReport());
		 System.out.println(developer.gereratePerformanceReport());
		 System.out.println(programmer.gereratePerformanceReport());
		 
		 System.out.println();
		 manager.manageProject();
		 developer.writeCode();
		 programmer.debugCode();
	
	}

}
