package demo.construction.binding.staticBinding;

public class CompileTimeError {
	public static void main(String[] args) {
		StaticBindingSample staticBindingSample = new StaticBindingSample();
		staticBindingSample.printMe(null);
		//staticBindingSample.sayYourAge();//doesn't exist!
	}
}
