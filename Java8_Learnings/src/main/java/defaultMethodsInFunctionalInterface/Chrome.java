package defaultMethodsInFunctionalInterface;

public class Chrome implements Browser {

	@Override
	public void browser() {
		System.out.println("Chrome browser");

	}	
	
	public static void main(String[] args) {
		Browser browser = new Chrome();
		
		browser.playMedia(); // this method is default method present in browser interface 
	}
}
