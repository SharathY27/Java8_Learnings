package anonymousInnerClass.UsingAbstractClass;

public class Runner extends AbstractClassExample{

	//This is classical way
	@Override
	public void add() {
		System.out.println("Addition");
		
	}
	
	public static void main(String[] args) {
		
		AbstractClassExample abstractClassExample = new AbstractClassExample() {
			
			@Override
			public void add() {
				System.out.println("Addition");
				
			}
		};
		
		abstractClassExample.add();
		
	}
}
