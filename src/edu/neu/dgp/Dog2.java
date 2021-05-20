package edu.neu.dgp;

public class Dog2 extends AbstractAnimalAPI {

	public Dog2() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Dog2 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Dog2 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Dog2 speak");
	}

	@Override
	public String toString() {
		return "Dog2";
	}

}
