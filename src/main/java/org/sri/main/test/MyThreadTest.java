package org.sri.main.test;

import org.sri.util.MyPriorityThread;

public class MyThreadTest {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		MyPriorityThread hi = new MyPriorityThread(Thread.NORM_PRIORITY + 4);
		MyPriorityThread lo = new MyPriorityThread(Thread.NORM_PRIORITY - 3);
		lo.start();
		hi.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}

		lo.stop();
		hi.stop();
		// Wait for child threads to terminate.
		try {
			hi.t.join();
			lo.t.join();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println("Low-priority thread 2: " + lo.click);
		System.out.println("High-priority thread: " + hi.click);
		
		
	}
}
