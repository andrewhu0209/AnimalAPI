package edu.neu.dgp;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimalAPI {

	public static void demo() {

		System.out.println("ZooAnimalAPI animal list: ");
		List<AnimalAPI> zoo = new ArrayList<>();
		zoo.add(new Cat1());
		zoo.add(new Dog1());
		zoo.add(new Lion1());

		for (AnimalAPI animal : zoo) {
			System.out.println(animal);
			animal.eat();
			animal.move();
			animal.speak();
			System.out.println("");
		}

	}

}
