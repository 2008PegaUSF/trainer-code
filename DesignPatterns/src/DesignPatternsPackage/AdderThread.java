package DesignPatternsPackage;

import java.util.Deque;

public class AdderThread extends Thread {
	
	Deque<Integer> aDeque;
	
	public AdderThread(Deque<Integer> aDeque) {
		this.aDeque = aDeque;
	}
	
	public void run() {
		// Adds to the deque
	}
}
