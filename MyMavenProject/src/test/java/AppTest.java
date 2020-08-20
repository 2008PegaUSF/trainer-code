import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import MyPackage.PrimeChecker;

public class AppTest {
	
	int myNumber() {
		return 5;
	}
	
	@Test
	public void myFirstTest() {
		Assertions.assertTrue(true);
	}
	
	@Test
	@Disabled
	public void myOtherTest() {
		Assertions.assertTrue(false);
	}
	
	@Test
	public void testPrimeChecker13() {
		Assertions.assertTrue(PrimeChecker.isPrime(13));
	}
	
	@Test
	public void testPrimeChecker12() {
		Assertions.assertFalse(PrimeChecker.isPrime(12));
	}
	
	@Test
	public void testMyNums() {
		Assertions.assertNotEquals(8, myNumber());
		System.out.println("Hi!");
	}
}
