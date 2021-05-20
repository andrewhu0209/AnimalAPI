package edu.neu.dgp;

public class Lion2 extends AbstractAnimalAPI {

	public Lion2() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Lion2 eat");
	}

	/**
	 * API move around.
	 */
	public void move() {
		System.out.println("Lion2 move");
	}

	/**
	 * API speak.
	 */
	public void speak() {
		System.out.println("Lion2 speak");
	}

	@Override
	public String toString() {
		return "Lion2";
	}

}
