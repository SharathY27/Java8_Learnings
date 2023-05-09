package reusableUtilitiesWithJava7;

interface IStringUtils7 {
	public String covertToUppercase(String word);

	public String covertToLowercase(String word);
}

public class StringUtilsImpl7 implements IStringUtils7 {

	@Override
	public String covertToLowercase(String word) {
		return word.toLowerCase();
	}

	@Override
	public String covertToUppercase(String word) {

		return word.toUpperCase();
	}

	public static void main(String[] args) {
		StringUtilsImpl7 impl = new StringUtilsImpl7();
		System.out.println(impl.covertToLowercase("ABC"));
		System.out.println(impl.covertToUppercase("abc"));
	}

}
