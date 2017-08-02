package org.sri.util;

public class MyCustomThread implements Runnable {
	
	Thread t;
	
	MyCustomThread(){
		t = new Thread(this, "Sri Sub child Thread");
		System.out.println("Sub Child thread: " + t);
		t.start();
	}

	public void run() {
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
		
	}

}
