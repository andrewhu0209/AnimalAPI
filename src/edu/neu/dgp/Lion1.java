package edu.neu.dgp;

public class Lion1 extends AnimalAPI {

	public Lion1() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Lion1 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Lion1 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Lion1 speak");
	}

	@Override
	public String toString() {
		return "Lion1";
	}

}
