package MyPackage;

import java.io.IOException;

public class App {
	public static void main(String[] args) {
		
		// This exception is unchecked,
		// so no try/catch needed
		Object o = new Object();
		o = null;
		Problem.uncheckedIterate(o);
		
		try {
			Problem.iterate();
			
			/* Object o = new Object();
			o = null;
			Problem.uncheckedIterate(o);*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Goodbye.");
		}
	}
}
