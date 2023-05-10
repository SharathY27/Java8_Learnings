package builtInFunctionalInterfaces.PredicateInterface.PredicateChaining;

import java.util.function.*;

public class PredicateChainingExample {

	Predicate<Integer> tenthScore = (input)-> input>400;
	Predicate<Integer> twelthScore = score -> score>500;
	Predicate<Boolean> opposite = input->input;

	public void orExample() {
		System.out.println(tenthScore.or(twelthScore).test(410));
	}

	public void andExample() {
		System.out.println(tenthScore.and(twelthScore).test(310));
	}

	public void negateExample() {
		System.out.println(opposite.negate().test(false));
	}
	
	public static void main(String[] args) {
		PredicateChainingExample chainingExample = new PredicateChainingExample();
		chainingExample.orExample();
		chainingExample.andExample();
		chainingExample.negateExample();
	}

}
