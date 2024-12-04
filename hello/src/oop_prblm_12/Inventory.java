package oop_prblm_12;
import java.util.ArrayList;

public class Inventory {
      ArrayList<Product> productList = new ArrayList<Product>();
      
      public void addProduct(Product product) {
    	  productList.add(product);
      }
      public void removeProduct(Product product) {
    	  productList.remove(product);
      }
      
      public void checkLowInventory() {
    	  for(Product product: productList) {
    		  if(product.getQuantity() <= 10) {
    			  System.out.println(product.getName()+" is running low in inventory. The current quantity: "+product.getQuantity());
    			  
    		  }
    	  }
      }
}
