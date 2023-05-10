package methodReferenceOperator;

import java.util.function.Function;

public class ArbitraryObjectOfAnyType {
	
	//arbitrary means random
	//any type is class
	
	public static void main(String[] args) {
		
		Function<String,String> toLower = input->input.toLowerCase();
		System.out.println(toLower.apply("ABC"));
		
		//Here .toLowerCase() is instance method present inside String class
		
		Function<String,String> toLowerUsingMethodRef = String::toLowerCase;  //Here toLowerCase is instance method 
		System.out.println(toLowerUsingMethodRef.apply("ABC"));
		
		//How we called the instance method is, in Function<String,String> we pass input and output objects
		//this object is being used for calling instance method
		
//		Whenever using method reference operator () after method name should not come, only method name should come
		
		
		
	}
	

}
