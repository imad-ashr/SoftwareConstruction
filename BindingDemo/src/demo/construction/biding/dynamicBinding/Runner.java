package demo.construction.biding.dynamicBinding;

public class Runner {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.whatDoYouEat();
		
		Animal dog = new Dog();
		dog.whatDoYouEat();
	}
}
