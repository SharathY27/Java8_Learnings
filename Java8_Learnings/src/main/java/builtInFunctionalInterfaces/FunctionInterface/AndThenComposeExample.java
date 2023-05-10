package builtInFunctionalInterfaces.FunctionInterface;

import java.util.function.Function;

public class AndThenComposeExample {

	// andThen & compose are two default methods present in Function interface , its
	// mainly used for method chaining
	

	public static void main(String[] args) {


		Function<String, String> clearNEET = (input) -> {
			System.out.println("clear NEET exam");
			return "";
		};

		Function<String, String> becomeDoctor = (input) -> {
			System.out.println("After clearing NEET you can become an Doctor");
			return "";
		};

		clearNEET.andThen(becomeDoctor).apply(""); //clearNEET function will run first and becomeDoctor second 
		becomeDoctor.compose(clearNEET).apply(""); // method inside compose function will execute first and then becomeDoctor
		
		
	}

}
