package edu.neu.dgp;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimalAPI {

	public static void demo() {

		System.out.println("ZooAbstractAnimalAPI animal list: ");
		List<AbstractAnimalAPI> zoo = new ArrayList<>();

		zoo.add(new Cat2());
		zoo.add(new Dog2());
		zoo.add(new Lion2());

		for (AbstractAnimalAPI animal : zoo) {
			animal.eat();
			animal.move();
			animal.speak();
			System.out.println(animal);
			System.out.println("");
		}

	}

}
