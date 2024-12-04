package inheritance2;

public class Programmer extends Developer{

	public Programmer(String name, String address, double salary,String jobTitle, String programmingLanguage) {
		super(name, address, salary,jobTitle, programmingLanguage);
	}
	
	@Override
	public double calculateBonus() {
		return getSalary()*0.12;
	}
	@Override
	public String gereratePerformanceReport() {
		return "Performance report for programmer "+ getName()+ ": Best.";
		
	}
	
	public void debugCode() {
		System.out.println("Programmer "+ getName()+" is debug code in "+getProgrammingLanguage());
	}
       
}
