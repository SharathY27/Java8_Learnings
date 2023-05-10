package builtInFunctionalInterfaces.FunctionInterface;

import java.util.function.Function;

public class UsdToInr {

	// this is normal method of converting usd to inr
	public double usdToInr(int usd) {
		return usd * 81.5;
	}

	// using lambda
	public void usingLambda() {
		Function<Integer, Double> usdToInr = usd -> usd * 81.5;
		System.out.println(usdToInr.apply(10));
	}

	// Here Function<inputDatatype,outputDatatype> is a built in functional
	// interface which takes one input and gives one output
	// apply is SAM in Function interface 
	public void usingAnonymous() {
		Function<Integer, Double> usdToInr = new Function<Integer, Double>() {

			@Override
			public Double apply(Integer usd) {

				return usd * 81.5;
			}
		};
		System.out.println(usdToInr.apply(10));
	}

	public static void main(String[] args) {

		UsdToInr conversion = new UsdToInr();
		conversion.usdToInr(10);
		conversion.usingAnonymous();
		conversion.usingLambda();
	}

}
