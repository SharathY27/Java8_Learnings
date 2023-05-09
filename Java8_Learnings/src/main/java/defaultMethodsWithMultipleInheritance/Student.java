package defaultMethodsWithMultipleInheritance;

interface Dad {
	default void joinCollege() {
		System.out.println("Join Anna Univeristy");
	}
}

interface GirlFriend {
	default void joinCollege() {
		System.out.println("Join SRM Univeristy");
	}
}

public class Student implements Dad,GirlFriend{

//	public void joinCollege() {
//		System.out.println("I am not going to college");   // this is own implementation 
//	}
	
	
	//using method already present in any one of the interface
	
	public void joinCollege(){
		Dad.super.joinCollege();    //going with dad's advice
	}
	
	public static void main(String[] args) {
		
		new Student().joinCollege();
		
	}
	
	
	
}
