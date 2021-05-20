package edu.neu.dgp;

public class Cat1 extends AnimalAPI {

	public Cat1() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Cat1 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Cat1 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Cat1 speak");
	}

	@Override
	public String toString() {
		return "Cat1";
	}

}
