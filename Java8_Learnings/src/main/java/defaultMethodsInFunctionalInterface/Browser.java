package defaultMethodsInFunctionalInterface;

@FunctionalInterface
public interface Browser {
	
	void browser();

	//Here we browser method any class which implements this interface needs to give implementation for browser method
	// if you have 100 browser and later for update you are adding one more method in browser interface which may or may not 
//		be overrided so in that case default method comes into play
	
	default void playMedia() {
		System.out.println("Browser media player");
	}
	
	
	
	
}
