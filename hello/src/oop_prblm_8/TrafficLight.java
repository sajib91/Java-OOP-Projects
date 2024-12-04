package oop_prblm_8;

public class TrafficLight {
	private String color;
	private double duration;
	
	public TrafficLight(String color, double duration) {
		
		this.color = color;
		this.duration = duration;
	}

	public void changeColor(String newColor) {
		color = newColor;
	}
	public boolean isRed() {
		return color.equals("Red");
	}
	public boolean isGreen() {
		return color.equals("Green");
	}
	
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	

}
