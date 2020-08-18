package MyPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class App {
	public static void main(String[] args) {
		// Our friendly ArrayList
		ArrayList<String> al = new ArrayList<String>();
		al.add("First string");
		al.add("Second string");
		al.add("Third string");
		
		Object o = new Object();
		Stack<String> stack = new Stack<String>();
		
		MyGeneric<Stack<String>> myGenericStack = new MyGeneric<Stack<String>>();
		myGenericStack.myT = stack;
		myGenericStack.printMyT();
		
		// Basic for loop
		for (int i = 0; i < al.size(); ++i) {
			System.out.println(al.get(i));
		}
		
		// Enhanced for loop
		for (String s : al) {
			System.out.println(s);
		}
		
		// Using an Iterator
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
