package builtInFunctionalInterfaces.BiConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {
	
	//BiConsumer interface takes two inputs and returns nothing
	
	static BiConsumer<Integer,Integer> add =  (num1,num2)->System.out.println(num1+num2);
	
	static BiConsumer<List<String>,String> concatenation = (name,company)-> {
		name.forEach(input->  System.out.println(input.concat(" "+ company)));
	};
	
	public static void main(String[] args) {
		add.accept(2, 2);
		concatenation.accept(Arrays.asList("Sharath","Mani"), "Google");
	}
	
	
	
	

}
