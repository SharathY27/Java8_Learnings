package builtInFunctionalInterfaces.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	
	//BiPredicate interface is same as predicate interface which takes two input and return boolean result
	
	static BiPredicate<String,String> check;
	
	public static void main(String[] args) {
		
		check= (fname,lname)-> !lname.isEmpty();
		System.out.println(check.test("Sharath", "Y"));
		
		
		check = (name1,name2)-> name1.equals(name2);
		System.out.println(check.test("Sharath", "Sharat"));
		
	}
	
	
	

}
