package product_Hierarchy;

public class ElectronicsProduct extends Product {
	 private String brand;
	    private int warrantyPeriod; 

	    public ElectronicsProduct(int id, String name, double price, int quantity, String brand, int warrantyPeriod) {
	        super(id, name, price, quantity);
	        this.brand = brand;
	        this.warrantyPeriod = warrantyPeriod;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public int getWarrantyPeriod() {
	        return warrantyPeriod;
	    }

	    @Override
	    public void displayProductDetails() {
	        super.displayProductDetails();
	        System.out.println("Brand: " + brand + ", Warranty Period: " + warrantyPeriod + " months");
	    }

}
