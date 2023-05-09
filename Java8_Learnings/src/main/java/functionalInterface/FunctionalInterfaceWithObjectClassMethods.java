package functionalInterface;


@FunctionalInterface
public interface FunctionalInterfaceWithObjectClassMethods {
	
	
	void accept();
	int hashCode();// hashCode method is from object class even though its functional it can have object class methods
	boolean equals(Object obj); // this method is also from object class

}
