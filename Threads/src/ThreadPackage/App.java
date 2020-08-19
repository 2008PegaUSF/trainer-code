package ThreadPackage;

public class App {
	public static void main(String[] args) {
		CustomThread ct1 = new CustomThread(), 
				ct2 = new CustomThread(),
				ct3 = new CustomThread();
		
		try {
			ct1.start();
			ct1.join();
			
			ct2.start();
			ct2.join();
			
			ct3.start();
			ct3.join();
			
			for (Integer i : CustomThread.myNumbers) {
				System.out.println("Number:" + i);
			}
		} catch (Exception e) {
			
		}
	}
}
