package edu.neu.dgp;

public class Cat3 implements AnimalisticAPI {

	public Cat3() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Cat3 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Cat3 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Cat3 speak");
	}

	@Override
	public String toString() {
		return "Cat3";
	}

}
