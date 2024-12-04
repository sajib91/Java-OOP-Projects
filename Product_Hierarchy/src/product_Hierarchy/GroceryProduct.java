package product_Hierarchy;

import java.util.Date;

public class GroceryProduct extends Product {
	private Date expirationDate;
    private String storageTemperature;

    public GroceryProduct(int id, String name, double price, int quantity, Date expirationDate, String storageTemperature) {
        super(id, name, price, quantity);
        this.expirationDate = expirationDate;
        this.storageTemperature = storageTemperature;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getStorageTemperature() {
        return storageTemperature;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Expiration Date: " + expirationDate + ", Storage Temperature: " + storageTemperature);
    }
}
