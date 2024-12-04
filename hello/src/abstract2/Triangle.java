package abstract2;

 class Triangle extends Shape{
     private double a;
     private double b;
     private double c;
	public Triangle(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
     
    @Override
    double calculateArea() {
    	double s = (a+b+c)/2;
    	double ans = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    	return ans;
    }
    @Override
    double calculatePerimeter() {
    	return a+b+c;
    }

 }
