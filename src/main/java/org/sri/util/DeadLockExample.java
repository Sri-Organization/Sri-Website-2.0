package org.sri.util;

public class DeadLockExample implements Runnable {
	Foo a = new Foo();
	Bar b = new Bar();

	DeadLockExample() {
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "RacingThread");
		t.start();
		a.foo(b); // get lock on a in this thread.
		System.out.println("Back in main thread");
	}

	public void run() {
		b.bar(a); // get lock on b in other thread.
		System.out.println("Back in other thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeadLockExample();
	}

}
