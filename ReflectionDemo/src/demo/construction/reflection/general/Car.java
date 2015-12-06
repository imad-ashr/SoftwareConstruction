/**
 * 
 */
package demo.construction.reflection.general;

/**
 * @author eashour
 *
 */
public class Car {
	private int numberOfDoors;
	private String manufacturer;
	public Car() {
		System.out.println("Default constructor!");
	}
	public Car(Integer numberOfDoors, String manufacturer) {
		this.numberOfDoors = numberOfDoors;
		this.manufacturer = manufacturer;
		System.out.println(String.format("Car: %s has %s doors", manufacturer, numberOfDoors));
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the numberOfDoors
	 */
	public int getnumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setnumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
