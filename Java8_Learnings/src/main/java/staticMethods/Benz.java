package staticMethods;

interface Car {

	public static void start() {
		System.out.println("Starting from Car Interface");
	}
}

public class Benz implements Car {

	public static void start() {
		System.out.println("Starting from Benz Class");
	}
	
	public static void main(String[] args) {
		
		// Here start is the static method present in Car interface which can't be overrided 
		// we can have same method with same signature also but without override annotaiton on top of it
		
		// only way to call start in interface is using Interface name only
		
		Car.start();
		new Benz().start();  
		Benz.start();
		 
		
	}

}
