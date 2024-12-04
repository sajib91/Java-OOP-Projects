package product_Hierarchy;
import java.util.*;


public class Inventory {
	 private Map<Integer, Product> inventory;

	    public Inventory() {
	        inventory = new HashMap<>();
	    }

	    public void addProduct(Product product) {
	        inventory.put(product.getId(), product);
	    }

	    public void removeProduct(int productId) {
	        if (inventory.containsKey(productId)) {
	            inventory.remove(productId);
	        } else {
	            System.out.println("Product not found");
	        }
	    }

	    public void updateProduct(Product product) {
	        if (inventory.containsKey(product.getId())) {
	            inventory.put(product.getId(), product);
	        } else {
	            System.out.println("Product not found");
	        }
	    }

	    public Product searchProductByName(String name) {
	        for (Product product : inventory.values()) {
	            if (product.getName().equalsIgnoreCase(name)) {
	                return product;
	            }
	        }
	        return null;
	    }

	    public List<Product> searchProductsByCategory(Class<?> category) {
	        List<Product> result = new ArrayList<>();
	        for (Product product : inventory.values()) {
	            if (category.isInstance(product)) {
	                result.add(product);
	            }
	        }
	        return result;
	    }

	    public void displayAllProducts() {
	        for (Product product : inventory.values()) {
	            product.displayProductDetails();
	            System.out.println();
	        }
	    }
}
