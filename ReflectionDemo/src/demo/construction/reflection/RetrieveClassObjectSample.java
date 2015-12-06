package demo.construction.reflection;

import demo.construction.reflection.general.Vehicle;

/**
 * Retrieve class dynamically using Class.forName()
 * 
 * @author eashour
 *
 */
public class RetrieveClassObjectSample {

	public static void main(String[] args) {
		String classFullName = "demo.construction.reflection.general.Vehicle";
		try {
			Class<?> vehicleClass = Class.forName(classFullName);// retrieves the
																	// class
																	// using
																	// full
																	// qualified
																	// name
			
			Object vehicleClassObject = vehicleClass.newInstance();// instantiation;
																	// default
																	// constructor
																	// will be
																	// called
			
			((Vehicle) vehicleClassObject).sayHelloWorld();//calls some public method

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
