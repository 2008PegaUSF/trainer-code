package DesignPatternsPackage;

import java.util.Deque;

public class ThreadFactory {
	
	DequeSingleton ds;
	
	public ThreadFactory(DequeSingleton ds) {
		this.ds = ds;
	}
	
	public Thread CreateThread(boolean adderType) {
		if (adderType) {
			return new AdderThread(ds.getDeque());
		} else {
			return new EaterThread();
		}
	}
}
