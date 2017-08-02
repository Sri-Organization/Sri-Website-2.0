package org.sri.util;

public class CallMe {

	 void  call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
	 
	 void  call2(String msg) {
			System.out.print("[" + msg + " 2 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
			System.out.println("]");
		}
	
}
