package lambdaExpression;

@FunctionalInterface
interface IPanchayat{
	String interrogate(String question);
}

public class Panchayat {
	
	
	public void usingAnonymous() {
		IPanchayat iPanchayat = new IPanchayat() {
			
			@Override
			public String interrogate(String question) {
				return "Enna" + question;
			}
		};
		System.out.println(iPanchayat.interrogate("Ponna Kaiya pudichu iluthiya?!"));
	}
	
	
	public void usingLambda() {
		IPanchayat pan = (question)-> "Enna" + question ;
		System.out.println(pan.interrogate("Ponna Kaiya pudichu iluthiya?!"));
	}
	
	public static void main(String[] args) {
		Panchayat panchayat = new Panchayat();
		panchayat.usingAnonymous();
		panchayat.usingLambda();
	}

}
