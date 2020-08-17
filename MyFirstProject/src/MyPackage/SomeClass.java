package MyPackage;

public class SomeClass extends MyParent implements MyInterface {
	
	private String className = "";
	
	@Override
	public void printAMessage() {
		System.out.println("A message.");
	}
	
	protected void printMyStrings(String... strings) {
		for (String s : strings) {
			System.out.println(s);
		}
		
		/* for (int i = 0; i < strings.length; ++i) {
			System.out.println(strings[i]);
		} */
	}
	
	/* public void interfaceMessage() {
		System.out.println("Interface message");
	} */
	
	public String getCName() {
		return className;
	}
	
	public void setCName(String className) {
		this.className = className;
	}
}
