package edu.neu.dgp;

public class Cat2 extends AbstractAnimalAPI {

	public Cat2() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Cat2 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Cat2 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Cat2 speak");
	}

	@Override
	public String toString() {
		return "Cat2";
	}

}
