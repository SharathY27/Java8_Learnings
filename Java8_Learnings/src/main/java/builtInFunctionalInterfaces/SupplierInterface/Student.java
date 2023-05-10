package builtInFunctionalInterfaces.SupplierInterface;

public class Student {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Name : "+getName()+", Age : "+ getAge();
	}
	
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	

}
