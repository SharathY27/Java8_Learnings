package anonymousInnerClass.UsingInterface;

interface ICalculate{
	public void add();
}

public class InterfaceExample {

	ICalculate ical = new ICalculate() {
		@Override
		public void add() {
			System.out.println("Addition");
		}
	};
}
