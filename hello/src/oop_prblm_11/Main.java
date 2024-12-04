package oop_prblm_11;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Airplane fl1 = new Airplane("CD2155","Bangladesh",LocalTime.of(5, 25));
		
		Airplane fl2 = new Airplane("CD21534","USA",LocalTime.of(2, 10));
		
		Airplane fl3 = new Airplane("CD2155","Canada",LocalTime.of(3, 25));
		
		
		System.out.println("Flight status:");
		fl1.checkStatus();
		fl2.checkStatus();
		fl3.checkStatus();
		
		fl1.delay(40);
		fl3.delay(10);
		System.out.println("\nFlight status:");
		fl1.checkStatus();
		fl2.checkStatus();
		fl3.checkStatus();
	}


}
