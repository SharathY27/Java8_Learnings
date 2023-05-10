package builtInFunctionalInterfaces.ForEachFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachFunctionExampleWithConsumerInterface {
	
	public static void main(String[] args) {
		
		List<Integer> list  = Arrays.asList(1,3,5,7,9,2,6);
		

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("============================");
		
		// Enhanced for loop / for each loop
		for(Integer num:list) {
			System.out.println(num);
		}
		
		System.out.println("============================");
		
		Consumer<Number> consumer = input-> System.out.println(input);
		
		list.forEach(consumer);
//		list.forEach(input-> System.out.println(input));   // we can define like this
		
		//check notes if you have doubt
		
		
		
		
	}
	
	
	

}
