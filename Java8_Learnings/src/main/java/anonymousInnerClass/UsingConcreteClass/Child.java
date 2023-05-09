package anonymousInnerClass.UsingConcreteClass;

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Parent parent = new Parent() {
			@Override
			public void findPartner() {
				System.out.println("I will find my match");
			}
		};
		
		parent.findPartner();
	}
	

}
