package ThreadPackage;

import java.util.ArrayList;
import java.util.Random;

public class CustomThread extends Thread {
	
	public static ArrayList<Integer> myNumbers;
	
	public CustomThread() {
		if (myNumbers == null)
			myNumbers = new ArrayList<Integer>();
	}
	
	// Synchronized method
	public static synchronized void addNumber() {
		Random r = new Random();
		int i = r.nextInt();
		System.out.println("Syncd static add, next int: " + i);
		
		myNumbers.add(i);
	}
	
	// Synchronized block
	public void addNumberSyncBlock() {
		
		synchronized(myNumbers) {
			Random r = new Random();
			int i = r.nextInt();
			
			myNumbers.add(i);
			System.out.println("Thread: " + this.toString() + ". Next int: " 
					+ myNumbers.get(myNumbers.size() - 1));
		}
	}
	
	public void run() {
		for (int i = 0; i < 10; ++i) {
			// addNumber();
			addNumberSyncBlock();
		}
	}
}
