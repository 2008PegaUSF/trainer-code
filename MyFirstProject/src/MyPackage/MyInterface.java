package MyPackage;

public interface MyInterface {
	
	default public void interfaceMessage() {
		System.out.println("The default message.");
	}
}
