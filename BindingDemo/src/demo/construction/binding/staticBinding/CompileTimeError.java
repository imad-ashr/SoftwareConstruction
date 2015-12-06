package demo.construction.biding.staticBinding;

public class CompileTimeError {
	public static void main(String[] args) {
		StaticBindingSample staticBindingSample = new StaticBindingSample();
		//staticBindingSample.sayYourAge();//doesn't exist!
	}
}
