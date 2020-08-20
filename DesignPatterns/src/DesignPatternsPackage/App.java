package DesignPatternsPackage;

public class App {
	public static void main(String[] args) {
		DequeSingleton ds = new DequeSingleton();
		ThreadFactory tf = new ThreadFactory(ds);
		
		AdderThread at = (AdderThread)tf.CreateThread(true);
		EaterThread et = (EaterThread)tf.CreateThread(false);
	}
}
