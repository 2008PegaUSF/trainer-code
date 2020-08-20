package DesignPatternsPackage;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSingleton {
	static Deque<Integer> numbers;
	
	public DequeSingleton() {
		if (numbers == null)
			numbers = new ArrayDeque<Integer>();
	}
	
	public Deque<Integer> getDeque() {
		return numbers;
	}
}
