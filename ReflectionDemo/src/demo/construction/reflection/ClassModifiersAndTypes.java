package demo.construction.reflection;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import static java.lang.System.out;

import demo.construction.reflection.general.Vehicle;

public class ClassModifiersAndTypes {
	public static void main(String[] args) {

		Class<Vehicle> vClass = Vehicle.class;
		System.out.println(Modifier.toString(vClass.getModifiers()));
	}
}
