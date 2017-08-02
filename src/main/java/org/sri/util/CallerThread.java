package org.sri.util;

public class CallerThread implements Runnable {

	String msg;
	CallMe target;
	public Thread t;
	
	public CallerThread(CallMe targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		
		
		
		synchronized (target) { // synchronized block
			
			System.out.println("Before Target");
			target.call(msg);
			System.out.println("After Target");
			
		}
		
		target.call2(msg);
	}

}
