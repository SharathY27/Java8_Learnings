package methodReferenceOperator;

@FunctionalInterface
interface IAdd{
	public void add(int num1,int num2);
}

public class StaticExample {
	
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	
	// Method reference operator :: can be used when you already have the implementation
	// Now , see In the interface we have void signature but in this class we have static int , so return type is not mandatory
	// mainly the number of arguments used for method is must
	
	public static void main(String[] args) {
		IAdd add =StaticExample::sum;
		add.add(2, 2);
	}
	
	
	

}
