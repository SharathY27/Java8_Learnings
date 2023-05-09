package reusableUtilitiesWithJava8;

interface IStringUtil8{
	
	public static String convertToLowercase(String word) {
		return word.toLowerCase();
	}
	
	public static String convertToUppercase(String word) {
		return word.toUpperCase();
	}
	
}

public class StringUtilImpl8 implements IStringUtil8{
	
	public static void main(String[] args) {
		
		System.out.println(IStringUtil8.convertToLowercase("ABC"));
		System.out.println(IStringUtil8.convertToUppercase("abc"));
	}

}
