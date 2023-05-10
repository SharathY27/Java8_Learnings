package builtInFunctionalInterfaces.PredicateInterface;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

//	Predicate is built in functional interface in java8, used when we want to get result in boolean 
//	In Predicate interface test is SAM.

	public static boolean checkEligibility(int candidateAge) {
		Predicate<Integer> check = age -> age > 18;
		return check.test(candidateAge);
	}

	public static void main(String[] args) {
		System.out.println(PredicateInterfaceExample.checkEligibility(19));
	}

}
