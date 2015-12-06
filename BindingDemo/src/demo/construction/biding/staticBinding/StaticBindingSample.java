package demo.construction.biding.staticBinding;

public class StaticBindingSample {
	private void sayYourName(){
		System.out.println("I'm SimpleStaticBinding");
	}
	
	public static void main(String[] args) {
		StaticBindingSample simpleStaticBinding = new StaticBindingSample();
		simpleStaticBinding.sayYourName();
	}

}
