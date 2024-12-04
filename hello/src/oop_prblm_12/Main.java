package oop_prblm_12;

public class Main {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Product p1 = new Product("Apple",50);
		Product p2 = new Product("Mango",8);
		Product p3 = new Product("Licchi",20);
		
		System.out.println("Add these product in inventory............\n");
		inventory.addProduct(p1);
		inventory.addProduct(p2);
		inventory.addProduct(p3);
		
		System.out.println("Check for low inventory:");
		inventory.checkLowInventory();

	}

}
