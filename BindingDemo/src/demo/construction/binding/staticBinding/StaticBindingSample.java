package demo.construction.binding.staticBinding;

public class StaticBindingSample {
	private void sayYourName(){
		System.out.println("I'm SimpleStaticBinding");
	}
	
	final public void printMe(Integer text){
		System.out.println(text.toString());
	}
	
	public static void main(String[] args) {
		StaticBindingSample simpleStaticBinding = new StaticBindingSample();
		simpleStaticBinding.sayYourName();
	}

}
