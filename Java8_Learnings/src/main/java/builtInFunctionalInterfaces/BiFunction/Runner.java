package builtInFunctionalInterfaces.BiFunction;

import java.util.function.BiFunction;

public class Runner {

	// BiFunction interface takes two inputs and return one output

	public void fullNameUsingBiFunctionInterface() {
		BiFunction<String, String, String> fullName = (fname, lname) -> fname + lname;
		System.out.println(fullName.apply("John", "Cena"));
	}

	public void additionUsingBiFunction() {
		BiFunction<Integer, Integer, Integer> add = (num1, num2) -> num1 + num2;
		System.out.println(add.apply(1, 1));
	}

}
