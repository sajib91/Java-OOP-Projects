package product_management;

public class ClothingProduct extends Product{
	public String brand;
	public String size;
	public String color;

	public ClothingProduct(String id, String name, String price, int quantity, String brand, String size, String color) {
		
		super(id, name, price, quantity);
	    this.brand = brand;
	    this.size = size;
	    this.color = color;
	}

	@Override
	public void addProduct(int amount) {
		// TODO Auto-generated method stub
		super.addProduct(amount);
	}

	@Override
	public void removeProductZ(int amount) {
		// TODO Auto-generated method stub
		super.removeProductZ(amount);
	}

	@Override
	public void updateProduct(String id, String name, String price, int quantity) {
		// TODO Auto-generated method stub
		super.updateProduct(id, name, price, quantity);
	}

	@Override
	public void printProduct() {
		// TODO Auto-generated method stub
		super.printProduct();
		System.out.println("Brand:"+this.brand+"Size:"+this.size+"color"+this.color);
	}

}
