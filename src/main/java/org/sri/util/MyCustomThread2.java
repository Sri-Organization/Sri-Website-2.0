package org.sri.util;

public class MyCustomThread2 extends Thread {
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(" 2 Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("2 Child interrupted.");
		}
		System.out.println("Exiting 2 child thread.");
	}
}
