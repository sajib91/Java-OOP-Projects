package oop_prblm_2;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog("Kutta","Cake");
		d1.display();
		
		// after update the name & breed
		d1.setName("Bideshi Kutta");
		d1.setBreed("vat khay");
		
		d1.display();

	}

}
