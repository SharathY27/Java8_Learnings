package methodReferenceOperator;

public class InstanceMethodExample {

	@FunctionalInterface
	interface IAdd {
		public void add(int num1, int num2);
	}

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {

		IAdd add = new InstanceMethodExample()::sum;
		add.add(2, 2);
	}

}
