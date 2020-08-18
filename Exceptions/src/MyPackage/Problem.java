package MyPackage;

public class Problem {
	
	public static void throwAnException(String message) throws Exception {
		throw new Exception(message);
	}
	
	public static void iterate() throws Exception {
		for (int i = 0; i < 10; ++i) {
			throwAnException("Exception: The number is " + i);
		}
	}
	
	public static void uncheckedIterate(Object o) {
		for (int i = 0; i < 10; ++i) {
			System.out.println(o.toString());
		}
	}
}
