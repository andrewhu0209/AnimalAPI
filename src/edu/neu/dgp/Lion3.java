package edu.neu.dgp;

public class Lion3 implements AnimalisticAPI {

	public Lion3() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Lion3 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Lion3 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Lion3 speak");
	}

	@Override
	public String toString() {
		return "Lion3";
	}

}
