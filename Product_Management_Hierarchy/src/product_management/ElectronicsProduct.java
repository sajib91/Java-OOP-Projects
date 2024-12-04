package product_management;

public class ElectronicsProduct extends Product{
	public String brand;
	public double warrantyPeriod;
	
	public ElectronicsProduct(String id, String name, String price, int quantity, String brand, double warrantyPeriod) {
		super(id, name, price, quantity);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;	

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
		System.out.println("Brand"+this.brand+ "Warranty:"+this.warrantyPeriod);
	}
	
	
	
	

}
