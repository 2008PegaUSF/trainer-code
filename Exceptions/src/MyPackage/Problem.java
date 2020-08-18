package MyPackage;

public class Problem {
	
	// This method throws an Exception when run, which
	// means any method that uses it must acknowledge its
	// checked exception payload!
	public static void throwAnException(String message) throws Exception {
		throw new Exception(message);
	}
	
	// Attempts to throw 10 exceptions
	public static void iterate() throws Exception {
		for (int i = 0; i < 10; ++i) {
			throwAnException("Exception: The number is " + i);
		}
	}
	
	// Tries to print Object o 10 times. If o is null, exception!
	public static void uncheckedIterate(Object o) {
		for (int i = 0; i < 10; ++i) {
			System.out.println(o.toString());
		}
	}
	
	// If m is 0, exception!
	public static int divideBad(int n, int m) {
		return n / m;
	}
	
	// This version catches the ArithmeticException
	// and returns 0
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
