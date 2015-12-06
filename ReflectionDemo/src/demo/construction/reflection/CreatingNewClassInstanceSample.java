/**
 * 
 */
package demo.construction.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import demo.construction.reflection.general.Car;

/**
 * @author eashour
 *
 */
public class CreatingNewClassInstanceSample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Constructor<Car> carConstructor;
		try {
			carConstructor = Car.class.getDeclaredConstructor(Integer.class, String.class);
			carConstructor.newInstance(4, "Mazda");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
