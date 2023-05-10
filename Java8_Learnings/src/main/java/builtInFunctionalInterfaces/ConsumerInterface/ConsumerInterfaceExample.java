package builtInFunctionalInterfaces.ConsumerInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceExample implements Consumer<String> {
	
	
//	Consumer Interface is functional interface which takes one input and returns nothing
	
	
	//this is classical way by implementing in class
	
	@Override
	public void accept(String t) {
		System.out.println(t.toLowerCase());	
		
	}
	
	public void usingClassicalWay() {
		accept("ABC");
	}
	
	public void usingAnonymousInnerClass() {
		Consumer<String> consumer = new Consumer<String>(){
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		};
		
		consumer.accept("abc");
	}
	
	public void usingLambda() {
		Consumer<String> con = (input)-> System.out.println(input + " is a word");
		Consumer<String> con1 = (input)-> System.out.println(input + " di mapla is an emotion");
		
		con.accept("Vanakkam");
		con1.accept("Vanakkam");
		
	
		con.andThen(con1);   // here we have andThen default method present in consumer interface same as in function interface 
		
	}
	
	
	public static void main(String[] args) {
		
		
		ConsumerInterfaceExample consumerInterfaceExample = new ConsumerInterfaceExample();
		consumerInterfaceExample.usingAnonymousInnerClass();
		consumerInterfaceExample.usingLambda();
		consumerInterfaceExample.usingClassicalWay();
	}
	

}
