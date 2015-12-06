package demo.construction.binding.dynamicBinding;

public class Cat extends Animal{
	@Override
	public void whatDoYouEat() {
		System.out.println("Mice!");
	}
	
	public void sayHelloWorld(){
		System.out.println("Hello, World!");
	}
	
	private void privateMethod(){
		System.out.println("I'm private!");
	}
}
