package org.sri.main.test;

import org.sri.util.CallMe;
import org.sri.util.CallerThread;

public class NewThreadTest {

	public static void main(String args[]) {
		CallMe target = new CallMe();
		CallerThread ob1 = new CallerThread(target, "Hello");
		CallerThread ob3 = new CallerThread(target, "World");
		CallerThread ob2 = new CallerThread(target, "Synchronized");
		
		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
	
}
