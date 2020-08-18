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
	
	public static int divideBad(int n, int m) {
		return n / m;
	}
	
	public static int divideGood(int n, int m) {
		try {
			return n / m;
		}
		catch (ArithmeticException e) {
			// Error handling
			return 0;
		}
	}
}
