package oop_prblm_8;

public class Main {

	public static void main(String[] args) {
		TrafficLight light = new TrafficLight("Red",5);
		
		System.out.println("The light is red."+light.isRed());
		System.out.println("The light is Green."+light.isGreen());
		
		light.changeColor("Green");
		System.out.println("\nThe light is red."+light.isRed());
		System.out.println("The light is Green."+light.isGreen());

	}

}
