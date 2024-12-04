package product_Hierarchy;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();

       ElectronicsProduct ep = new ElectronicsProduct(1, "Smartphone", 699.99, 50, "BrandX", 24);
        ClothingProduct cp = new ClothingProduct(2, "T-Shirt", 19.99, 200, "L", "Cotton");
        GroceryProduct gp = new GroceryProduct(3, "Milk", 1.99, 100, new Date(), "Refrigerated");

        inventory.addProduct(ep);
        inventory.addProduct(cp);
        inventory.addProduct(gp);

        inventory.displayAllProducts();

        System.out.println("Search by name 'T-Shirt': ");
        Product searchResult = inventory.searchProductByName("T-Shirt");
        if (searchResult != null) {
            searchResult.displayProductDetails();
        } else {
            System.out.println("Product not found");
        }

        System.out.println("Search by category ElectronicsProduct: ");
        List<Product> electronics = inventory.searchProductsByCategory(ElectronicsProduct.class);
        for (Product product : electronics) {
            product.displayProductDetails();
        }

	}

}
