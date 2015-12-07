package demo.construction.reflection;

import java.lang.reflect.Constructor;
import static java.lang.System.out;


import demo.construction.reflection.general.Car;

public class FindingConstructorsSample {

	public static void main(String[] args) {
		Class<Car> carClass = Car.class;
		Constructor[] carConstructors = carClass.getDeclaredConstructors();
		for (Constructor<Car> carConstructor : carConstructors) {
			out.format("%s\n", carConstructor.toGenericString());

		}

	}

}
