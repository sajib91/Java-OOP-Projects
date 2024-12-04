package abstract2;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(4.0);
		System.out.println("Area of Cricle: "+ circle.calculateArea());
		System.out.println("Perimeter of Circle: "+ circle.calculatePerimeter());
		
		System.out.println();
		
		Triangle triangle = new Triangle(4.0,5.0,3.0);
		System.out.println("Area of triangle: "+triangle.calculateArea());
		System.out.println("Perimeter of Triangle: "+triangle.calculatePerimeter());
		
	}
}
