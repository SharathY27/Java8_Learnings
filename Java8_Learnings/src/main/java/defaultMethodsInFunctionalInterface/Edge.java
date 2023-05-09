package defaultMethodsInFunctionalInterface;

public class Edge implements Browser {

	@Override
	public void browser() {
		System.out.println("Edge browser");
		
	}
	
	
	@Override
	public void playMedia() {
		System.out.println("Edge media player");
	}
	
	public static void main(String[] args) {
		Browser browser = new Edge();
		browser.playMedia();// it will call the play media method present in edge as we it is overrided here
	}
}
