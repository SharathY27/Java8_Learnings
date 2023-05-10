package builtInFunctionalInterfaces.IntPredicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntPredicateExample {

	// IntPredicate interface is mainly used to auto boxing and unboxing

	// Autoboxing is converting primitive datatypes like int,char,double to its
	// respective Wrapper objects like Integer,Character,Doubles
	// Unboxing means converting Wrapper objects into respective primitive
	// datatypes.

	// To avoid this autoboxing and unboxing by compiler , we have separate
	// Functional interface generic specific

	public static void autoBoxingExample() {
		Predicate<Integer> autoboxing = input -> input > 18;
		int a = 19;
		System.out.println(autoboxing.test(a)); // Here we are passing int value 19 into lambda which accepts Integer
												// values,
		// compiler automatically convert it to int to Integer, this is called
		// autoboxing.
	}

	public static void autoUnboxing() {
		Integer a = 10;
		int b = a; // here we are assigning Integer a value to int b , this is unboxing
		System.out.println(b);

	}

	// To avoid this autoboxing and unboxing by compiler , we have separate
	// Functional interface generic specific

	public static void intPredicateExample() {
		IntPredicate intPredicate = (input) -> input > 18;
		System.out.println(intPredicate.test(19));
//		In IntPredicate functional interface we have test method which is SAM, and here no need to mention generic type, because it will
//		accepts only primitive datatype int only so no autoboxing is happening here

//		Note:
//		====
		/*
		 * But in Predicate function we have test SAM method, in we need to mention type
		 * of wrapper class object its going to accept values like Integer,Double etc.,
		 */

	}

	public static void main(String[] args) {

		autoBoxingExample();
		autoUnboxing();
		intPredicateExample();
	}

}
