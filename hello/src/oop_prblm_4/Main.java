package oop_prblm_4;

public class Main {

	public static void main(String[] args) {
		CIrcle c1 = new CIrcle(3.5);
		System.out.println("Area: "+c1.getArea()+"; Circumference: "+c1.getCircumference());
		
		c1.setRedius(2.5);
		
		System.out.println("Area: "+c1.getArea()+"; Circumference: "+c1.getCircumference());
        
	}

}
