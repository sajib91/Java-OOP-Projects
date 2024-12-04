package product_Hierarchy;

public class ClothingProduct extends Product {
	 private String size;
	    private String material;

	    public ClothingProduct(int id, String name, double price, int quantity, String size, String material) {
	        super(id, name, price, quantity);
	        this.size = size;
	        this.material = material;
	    }

	    public String getSize() {
	        return size;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    @Override
	    public void displayProductDetails() {
	        super.displayProductDetails();
	        System.out.println("Size: " + size + ", Material: " + material);
	    }
}
