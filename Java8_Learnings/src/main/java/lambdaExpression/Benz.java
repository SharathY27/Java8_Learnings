package lambdaExpression;

@FunctionalInterface
interface Car {
	public void start();
}

public class Benz implements Car {

	@Override
	public void start() {
		System.out.println("Start from Benz");

	}

	public void usingClassicalWay() {
		Benz benz = new Benz();
		benz.start();
	}

	public void usingAnonymousClass() {
		Car car = new Car() {

			@Override
			public void start() {
				System.out.println("Start using anonymous");

			}
		};
		car.start();
	}

	public void usingLambda() {
		Car car = () -> System.out.println("start using lambda");  //Here Car is a functional interface so we can make use of lambda here
		car.start();
		
	}

	//Car is user defined functional interface with start as SAM , like this we have many built in functional interfaces in java 8
	
	public static void main(String[] args) {
		
		Benz benz = new Benz();
		benz.usingClassicalWay();
		benz.usingAnonymousClass();
		benz.usingLambda();
		
	}
}
