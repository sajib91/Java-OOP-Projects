package oop_prblm_2;

public class Dog {
	private String name;
	private String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
      
	public void display() {
		System.out.println(this.name + " " + this.breed);
	}
}
