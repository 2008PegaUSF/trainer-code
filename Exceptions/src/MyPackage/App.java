package MyPackage;

import java.io.IOException;

public class App {
	public static void main(String[] args) {
		
		// This exception is unchecked,
		// so no try/catch needed
		Object o = new Object();
		o = null;
		// Problem.uncheckedIterate(o);
		
		try {
			Problem.iterate();
			// int f = Problem.divideBad(5, 0);
			
		} catch (ArithmeticException ae) {
			System.out.println("Cant divide by 0 yo: " + ae.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		// Finally is optional!
		finally {
			System.out.println("Goodbye.");
		}
	}
}
