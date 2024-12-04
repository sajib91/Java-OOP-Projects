package project1;

public class ManagingDirector extends Employee{
    public ManagingDirector(String name, String id, int age, double basicSalary) {
    	super(name,id,age,basicSalary);
    }
    @Override
    public double calculateBonus() {
    	return getBasicSalary() * 0.05;
    }
    
    
}
