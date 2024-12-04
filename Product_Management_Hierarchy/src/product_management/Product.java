package product_management;

public class Product {
	private String id;
	private String name;
	private String price;
	private int quantity;
	
	public Product(String id, String name,String price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void addProduct(int amount) {
		this.quantity = this.quantity + amount;
	}
	public void removeProductZ(int amount) {
		if(this.quantity < amount) {
			System.out.println("Insufficient amount in stock");
		}
		else {
			this.quantity = this.quantity - amount;
		}
	}
	public void updateProduct(String id, String name, String price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
public void printProduct() {
		System.out.print("ID:"+this.id+"Name:"+this.name+"Price:"+this.price+"Quantity:"+this.quantity);
	}
	
	

}
