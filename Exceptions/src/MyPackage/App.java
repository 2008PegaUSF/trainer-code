package MyPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		
		// This exception is unchecked,
		// so no try/catch needed
		Object o = new Object();
		o = null;
		// Throws a NullPointerExeption
		// Problem.uncheckedIterate(o);
		
		// Try is not optional if you need to handle
		// a checked exception
		try {
			// Throws an Exception
			// Problem.iterate();
			
			// Throws an ArithmeticException
			// int f = Problem.divideBad(5, 0);
			
		} catch (ArithmeticException ae) {
			System.out.println("Cant divide by 0 yo: " + ae.getMessage());
		} 
		// You should probably have a general Exception catch block
		// but as long as you handle all specific checked exception
		// possibilities, you don't need it
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		// Finally is optional!
		finally {
			System.out.println("Goodbye.");
		}
	}
}
