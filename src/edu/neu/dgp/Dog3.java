package edu.neu.dgp;

public class Dog3 implements AnimalisticAPI {

	public Dog3() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Dog3 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Dog3 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Dog3 speak");
	}

	@Override
	public String toString() {
		return "Dog3";
	}

}
