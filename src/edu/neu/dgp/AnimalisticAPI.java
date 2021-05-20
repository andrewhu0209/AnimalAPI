package edu.neu.dgp;

import java.util.ArrayList;
import java.util.List;

public interface AnimalisticAPI {

	/**
	 * API eat food.
	 */
	public void eat();

	/**
	 * API move around.
	 */
	public void move();
	
	/**
	 * API speak.
	 */
	public void speak();
	
	/**
	 * String representative of object state
	 */
	@Override
	public String toString();
	/**
	 * Demonstrate the use of this class
	 */
	public static void demo() {
		System.out.println(AnimalAPI.class.getName() + ".demo()...");
		
		List<AnimalAPI> animalList = new ArrayList<>();
		
		animalList.add(new AnimalAPI());
		
		System.out.println(animalList.size() + " animals in list.");
		for (AnimalAPI animal : animalList) {
			System.out.println(animal);
		}
		
		System.out.println(AnimalAPI.class.getName() + ".demo()... done!");
	}

}
