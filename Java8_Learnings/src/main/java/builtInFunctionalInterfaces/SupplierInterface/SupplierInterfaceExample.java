package builtInFunctionalInterfaces.SupplierInterface;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierInterfaceExample implements Supplier<Object> {

	// Supplier is exact opposite to Consumer interface
	// Supplier Interface will return one output and takes no input
	// get is SAM in supplier interface

	@Override
	public Object get() {

		return Calendar.getInstance().getTime();
	}

	public void usingAnonymousInnerClass() {
		Supplier<Object> supplier = new Supplier<Object>() {
			public String get() {
				return "This is supplier interface";
			}
		};
		System.out.println(supplier.get());
	}

	public void usingLambda() {
		Supplier<Object> supplier = () -> "This is supplier interface with lambda";
		System.out.println(supplier.get());
	}

	public static void main(String[] args) {

		SupplierInterfaceExample example = new SupplierInterfaceExample();
		System.out.println(example.get()); // this is classical way of implementing method

		example.usingAnonymousInnerClass();
		example.usingLambda();
	}

}
