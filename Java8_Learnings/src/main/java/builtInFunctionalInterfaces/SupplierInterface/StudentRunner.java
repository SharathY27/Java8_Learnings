package builtInFunctionalInterfaces.SupplierInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentRunner {
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Sharath",23);
		Student student2 = new Student("Anbu",22);
		Student student3 = new Student("Hanish",24);
		Student student4 = new Student("Dinesh",24);
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		
//		Here we are printing the studentList which contains student objects so, it will print as object only
//		So now we have write toString() method in Student class so that object will converted into desired datatype
//		try running before overriding toString method in string class and after overriding
		studentList.forEach(input->System.out.println(input)); 
		
		Supplier<List<Student>> studentSupplier = ()-> studentList;
		
		System.out.println(studentSupplier.get());
		
	}

}
