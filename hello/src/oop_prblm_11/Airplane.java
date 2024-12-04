package oop_prblm_11;
import java.time.LocalTime;

public class Airplane {
    private String flightNo;
    private String destination;
    private LocalTime scheduleDeparture;
    private int delayTime;
    
	public Airplane(String flightNo, String destination, LocalTime scheduleDeparture) {
		
		this.flightNo = flightNo;
		this.destination = destination;
		this.scheduleDeparture = scheduleDeparture;
		this.delayTime = 0;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalTime getScheduleDeparture() {
		return scheduleDeparture;
	}

	public void setScheduleDeparture(LocalTime scheduleDeparture) {
		this.scheduleDeparture = scheduleDeparture;
	}

	public int getDelayTime() {
		return delayTime;
	}
    
	public void delay(int minutes) {
		this.delayTime = minutes;
		this.scheduleDeparture = this.scheduleDeparture.plusMinutes(minutes);
	}
	public void checkStatus() {
		if(delayTime == 0) {
			System.out.println("Flight "+ flightNo + " is on time");
		}
		else {
			System.out.println("Flight "+flightNo + " is delayed by "+ delayTime);
		}
		System.out.println();
	}
	
    
}








