package edu.neu.dgp;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimalisticAPI {

	public static void demo() {

		System.out.println("ZooAnimalisticAPI animal list: ");
		List<AnimalisticAPI> zoo = new ArrayList<>();
		zoo.add(new Cat3());
		zoo.add(new Dog3());
		zoo.add(new Lion3());
		for (AnimalisticAPI animal : zoo) {
			animal.eat();
			animal.move();
			animal.speak();
			System.out.println(animal);
		}

	}

}
