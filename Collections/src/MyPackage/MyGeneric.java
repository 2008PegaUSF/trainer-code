package MyPackage;

public class MyGeneric<T> {
	public T myT;
	
	public MyGeneric() {

	}
	
	public MyGeneric(T myT) {
		this.myT = myT;
		System.out.println(this.myT.toString());
	}
	
	public void printMyT() {
		System.out.println(myT.toString());
	}
}
