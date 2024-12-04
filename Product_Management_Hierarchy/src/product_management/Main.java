package product_management;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product p1 = new Product("XY250","Android","850$",25);
		ElectronicsProduct e1 = new ElectronicsProduct("XY250","Android","850$",25,"Apple",2.5);
		ClothingProduct c1 = new ClothingProduct("PQ265","Panjabi","25$",30,"Illiyan","XXL","Bule");
		GroceryProduct g1 = new GroceryProduct("SH265","Shampo","12$",50,"35.5 degree celcius","05/09/2024");
		
       e1.printProduct();
       e1.addProduct(2);
       e1.printProduct();
       System.out.println();
       c1.printProduct();
       c1.addProduct(2);
       c1.printProduct();
       System.out.println();
       
       g1.printProduct();
       g1.addProduct(2);
       g1.printProduct();
       
	}

}
