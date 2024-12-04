package oop_prblm_4;

public class CIrcle {
       private double redius;
       
       public CIrcle(double redius) {
   		this.redius = redius;
   	}
       
       public void setRedius(double redius) {
    	   this.redius = redius;
       }
       public double getArea() {
    	   return Math.PI*(this.redius)*(this.redius);
       }
       public double getCircumference() {
    	   return 2*Math.PI*(this.redius);
       }
	
       
       
}
