package builtInFunctionalInterfaces.PredicateInterface.PredicateChaining;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
		
		Predicate<Student> check = (student)-> student.getAge()>23;
		
		for(Student student: studentList) {
			if(check.test(student)) {
				System.out.println(student.getName());
			}
		}
		
	}

}
