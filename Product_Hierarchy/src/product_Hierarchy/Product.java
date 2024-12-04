package product_Hierarchy;
import java.util.*;

public class Product {
	 protected int id;
	    protected String name;
	    protected double price;
	    protected int quantity;

	    public Product(int id, String name, double price, int quantity) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public void displayProductDetails() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
	    }

	    public void addQuantity(int amount) {
	        this.quantity += amount;
	    }

	    public void reduceQuantity(int amount) {
	        if (amount <= this.quantity) {
	            this.quantity -= amount;
	        } else {
	            System.out.println("Insufficient quantity");
	        }
	    }
	
}
