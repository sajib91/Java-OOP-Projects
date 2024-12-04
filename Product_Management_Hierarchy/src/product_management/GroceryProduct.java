package product_management;

public class GroceryProduct extends Product{
	public String expirationDate;
	public String storageTemperature;

	
	public GroceryProduct(String id, String name, String price, int quantity, String storageTemperature, String expirationDate) {
		
		super(id, name, price, quantity);
		// TODO Auto-generated constructor stub
		this.expirationDate = expirationDate;
		this.storageTemperature = storageTemperature;
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
		System.out.println("Strorage Temprature:"+this.storageTemperature+"Expire:"+this.expirationDate);
	}


}
