package anonymousInnerClass.UsingMethodArgument;

public class ThreadWithRunnableArgument {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("This is run method in runnable interface");
				
			}
			
		});
		
		thread.start(); //start  method internally calls run method
		
		
		
	}

}
