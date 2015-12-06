package demo.construction.binding.dynamicBinding;

public class Runner {

	public static void main(String[] args) {
		
		//Uses Cat's method
		Animal cat = new Cat();
		cat.whatDoYouEat();
		
		//Uses what now?
		Animal dog = new Dog();
		dog.whatDoYouEat();
	}
}
