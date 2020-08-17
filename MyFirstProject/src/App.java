import MyPackage.*;

public class App {
	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		
		printObjectMessage(sc);
		doInterfaceThings(sc);
	}
	
	public static void printObjectMessage(MyParent mp) {
		mp.printAMessage();
	}
	
	public static void doInterfaceThings(MyInterface inf) {
		inf.interfaceMessage();
	}
}


