package edu.neu.dgp;

public class Dog1 extends AnimalAPI {

	public Dog1() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Dog1 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Dog1 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Dog1 speak");
	}

	@Override
	public String toString() {
		return "Dog1";
	}

}
