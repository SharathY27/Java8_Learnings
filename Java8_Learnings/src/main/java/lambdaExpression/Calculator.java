package lambdaExpression;

@FunctionalInterface
interface ICalculate{
	void add(int num1,int num2);
}


public class Calculator implements ICalculate {

	@Override
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	public void usingClassicalWay()
	{
		Calculator cal = new Calculator();
		cal.add(2, 2);
	}
	
	
	public void usingAnonymousInnerClass() {
		ICalculate  cal = new ICalculate() {
			public void add(int num1,int num2) {
				System.out.println(num1+ num2);
			}
		};
		
		cal.add(2, 2);
	}
	
	public void usingLambda() {
		ICalculate cal = (num1,num2)-> System.out.println(num1+num2);
		cal.add(2, 2);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.usingAnonymousInnerClass();
		calculator.usingClassicalWay();
		calculator.usingLambda();
	}
}
